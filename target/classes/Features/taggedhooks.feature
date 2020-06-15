Feature: Test Tagged Hooks

@First
Scenario: Free CRM login Test hook Scenario
Given user is already on login page 
When title of login page is FreeCRM 
Then user enters the user name and user enters password

@Second 
Scenario: Free CRM home page test
Given user clicks on home page icon
Then user should be redirected to home page screen

@Third
Scenario: Free CRM contacts test
Given user clicks on contact  icon
Then user should be redirected to contact page 