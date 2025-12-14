#!/bin/bash
set -e

# Build the app
npx shadow-cljs release app

# Start the server in the background
cd public
python3 -m http.server 8000 &
SERVER_PID=$!
cd ..

# Ensure we kill the server on exit
trap "kill $SERVER_PID" EXIT

# Run the tests
npx playwright test
