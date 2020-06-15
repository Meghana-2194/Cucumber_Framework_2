@FunctionalTest
Feature: Free CRM app test

@SmokeTest @RegressionTest @End2End
Scenario: Login with valid username and valid passoword
Given This is a valid login test

@RegressionTest
Scenario: Login with invalid username and invlaid password
Given This is a valid login test

@RegressionTest
Scenario: Login with invalid username and valid password
Given This is a valid login test

@RegressionTest
Scenario: Login with valid username and invlaid password
Given This is a valid login test

@SmokeTest
Scenario: Create a contact 
Given This is a valid contact test case

@SmokeTest @End2End
Scenario: Logout of the application
Given This is a valid logout test


