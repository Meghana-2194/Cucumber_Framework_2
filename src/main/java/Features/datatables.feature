Feature: Data table using Cucumber

Scenario: Free CRM deal test
Given user is already on login page 
Then Click on login button
Then user enters the username and password

|buddy6jar@gmail.com   | Buddy6jar! |

Then Click on submit button 
Then user moves to deal pages
Then user enters the deal details 
| Test1 | probability_test | 1000 |

Then close the deal page 