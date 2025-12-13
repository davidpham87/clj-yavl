const { test, expect } = require('@playwright/test');

test('basic verification', async ({ page }) => {
  await page.goto('http://localhost:8000');
  await page.waitForLoadState('domcontentloaded');
  const title = await page.title();
  console.log('Page title: ' + title);
  await page.waitForSelector('#app', { timeout: 10000 });
  console.log('App loaded successfully');
});
