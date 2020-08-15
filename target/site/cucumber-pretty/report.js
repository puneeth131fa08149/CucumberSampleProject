$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/MavenProject/CucumberSampleProject/src/test/java/FeatureFile/File.feature");
formatter.feature({
  "line": 1,
  "name": "User can Login to application",
  "description": "",
  "id": "user-can-login-to-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "validate application details",
  "description": "",
  "id": "user-can-login-to-application;validate-application-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user open URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Customer click on CustomerMenu button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Customer clicks on customers menu item",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Customer clicks on Addnew button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Enter the details of customer info",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Customer can check Email generates",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user click on logout link",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "pgae title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "CustomerDetails.user_open_browser()"
});
formatter.result({
  "duration": 6321020900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 15
    }
  ],
  "location": "CustomerDetails.user_open_URL(String)"
});
formatter.result({
  "duration": 739532300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "CustomerDetails.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 335359400,
  "status": "passed"
});
formatter.match({
  "location": "CustomerDetails.clicks_on_login_button()"
});
formatter.result({
  "duration": 6059564200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "CustomerDetails.page_Title_should_be(String)"
});
formatter.result({
  "duration": 11146800,
  "status": "passed"
});
formatter.match({
  "location": "CustomerDetails.customer_click_on_CustomerMenu_button()"
});
formatter.result({
  "duration": 99886200,
  "status": "passed"
});
formatter.match({
  "location": "CustomerDetails.customer_clicks_on_customers_menu_item()"
});
formatter.result({
  "duration": 2009635600,
  "status": "passed"
});
formatter.match({
  "location": "CustomerDetails.customer_clicks_on_Addnew_button()"
});
formatter.result({
  "duration": 1136922300,
  "status": "passed"
});
formatter.match({
  "location": "CustomerDetails.enter_the_details_of_customer_info()"
});
formatter.result({
  "duration": 879909300,
  "status": "passed"
});
formatter.match({
  "location": "CustomerDetails.click_on_save_button()"
});
formatter.result({
  "duration": 2819090800,
  "status": "passed"
});
formatter.match({
  "location": "CustomerDetails.customer_can_check_Email_generates()"
});
formatter.result({
  "duration": 19300,
  "status": "passed"
});
formatter.match({
  "location": "CustomerDetails.user_click_on_logout_link()"
});
formatter.result({
  "duration": 1759390300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 22
    }
  ],
  "location": "CustomerDetails.pgae_title_should_be(String)"
});
formatter.result({
  "duration": 8027900,
  "status": "passed"
});
formatter.match({
  "location": "CustomerDetails.close_browser()"
});
formatter.result({
  "duration": 711538100,
  "status": "passed"
});
});