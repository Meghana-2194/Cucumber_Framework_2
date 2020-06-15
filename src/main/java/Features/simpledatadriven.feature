Feature: Simple data Driven Test

Scenario: Free CRM login Test hook Scenario
Given user is already on login page 
When title of login page is FreeCRM 
Then user enters the username "buddy6jar@gmail.com" and password "Buddy6jar!"
Then Click on Login button 