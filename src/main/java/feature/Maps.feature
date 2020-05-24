Feature: CRM login test 

Scenario: User able to login in with valid credentials 
	Given I am on CRM loginpage 
	When I enter username and password 
		|askbotta@gmail.com|Manoj123@|
	And I click on login button 
	Then I am click on companies tab 
	And I create a new company 
	Then I fill in new company detilas 
		|Company Name| Address | City| Description|perosn|
		|abc123		|  abc 		| abc| 1234| Sam|
		|abc234		|  abc 		| abc| 1234| 
		|abc345		|  abc 		| abc| 1234|
		|abc456		|  abc 		| abc| 1234|