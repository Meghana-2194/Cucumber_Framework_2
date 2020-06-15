$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Java Selenium/CucumberFramework/FreeCrmBDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters the user name and user enters password",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "users clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 10704715100,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.title_of_login_page_is_FreeCRM()"
});
formatter.result({
  "duration": 17052100,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.user_enters_the_user_name_and_user_enters_password()"
});
formatter.result({
  "duration": 6006769700,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.users_clicks_on_login_button()"
});
formatter.result({
  "duration": 351868800,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 19440600,
  "status": "passed"
});
});