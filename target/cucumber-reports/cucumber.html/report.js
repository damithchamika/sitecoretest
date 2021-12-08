$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testSiteCore.feature");
formatter.feature({
  "line": 1,
  "name": "Search product",
  "description": "",
  "id": "search-product",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User Able to Search product",
  "description": "",
  "id": "search-product;user-able-to-search-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user navigates to the website amazon",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "type \"laptop\" in the search textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "click on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on first results",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "assert that the laptop price",
  "keyword": "Then "
});
formatter.match({
  "location": "searchStepDefinition.user_navigates_to_the_website_amazon()"
});
formatter.result({
  "duration": 7966932900,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d96.0.4664.45)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-EGLEKUR\u0027, ip: \u0027192.168.8.101\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.35 (8df3babf8da8f..., userDataDir: C:\\Users\\Lenov0\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:60627}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 8b0a2ddcbb812819599388c7fd35cb95\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeAsyncScript(RemoteWebDriver.java:506)\r\n\tat com.paulhammant.ngwebdriver.NgWebDriver.waitForAngularRequestsToFinish(NgWebDriver.java:68)\r\n\tat com.Agorial.automation.seleniumpages.LoginPage.launchChromeBrowser(LoginPage.java:27)\r\n\tat com.sitecore.automation.testStepDefinition.searchStepDefinition.user_navigates_to_the_website_amazon(searchStepDefinition.java:15)\r\n\tat ✽.Given user navigates to the website amazon(testSiteCore.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "laptop",
      "offset": 6
    }
  ],
  "location": "searchStepDefinition.type_in_the_search_textbox(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "searchStepDefinition.click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "searchStepDefinition.click_on_first_results()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "searchStepDefinition.assert_that_the_laptop_price()"
});
formatter.result({
  "status": "skipped"
});
});