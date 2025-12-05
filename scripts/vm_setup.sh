#!/bin/bash

# This script is intended for Linux distributions.
# It uses sudo, so it will likely ask for your password.

# Exit immediately if a command exits with a non-zero status.
set -e

echo "--- Installing Babashka (bb) for Linux ---"
# Download and run the official Babashka installer
# This installer auto-detects Linux and installs the correct binary.
curl -sL https://raw.githubusercontent.com/babashka/babashka/master/install | sudo bash

echo "\n--- Installing Clojure (clj) for Linux ---"
# Download and run the official Clojure POSIX installer.
# This is the correct script for Linux, despite the "brew-install" name in the URL.
curl -L https://github.com/clojure/brew-install/releases/latest/download/posix-install.sh | sudo bash

echo "\n--- Verifying installations ---"

echo "\nTesting Babashka..."
# Test bb by evaluating (+ 1 1)
# The output should be '2'
bb -e "(+ 1 1)"

echo "\nTesting Clojure..."
# Test clojure by evaluating (+ 1 1)
# The output should be '2'
clojure -M -e "(+ 1 1)"

echo "\n--- Installation and verification complete! ---"

npm install

mkdir -p test-resources
git clone --depth 1 https://github.com/vega/vega-lite test-resources/vega-lite

git clone --depth 1 https://github.com/vega/vega-datasets test-resources/vega-datasets
