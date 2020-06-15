Feature: Simple data Driven Test

Scenario Outline: Free CRM login Test hook Scenario
Given user is already on login page 
When title of login page is FreeCRM 
Then user enters the username   "<username>" and password "<password>"
Then Click on Login button 

Examples:

  |  username | password |
  | buddy6jar@gmail.com | Buddy6jar! |
  |test123@gmail.com | test1234 |
  | hello@gmail.com | test678@@# |
    