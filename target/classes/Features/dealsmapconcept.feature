Feature: Data table using Map Concept in Cucumber 

Scenario: Free CRM deal test 
	Given user is already on login page 
	Then Click on login button 
	Then user enters the username and password 
		|username | password |
		|buddy6jar@gmail.com   | Buddy6jar! |
		
	Then Click on submit button 
	Then user moves to deal pages 
	Then user enters the deal details 
		|Title|Probability|Amount|
		| Test1 | probability_test1 | 1001 |
		| Test2 | probability_test2 | 1002 |
		| Test3 | probability_test3 | 1003 |
		| Test4 | probability_test4 | 1004 |
		
	Then close the deal page 