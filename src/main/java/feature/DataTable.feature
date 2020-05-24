Feature: Free crm login 

Scenario: User able to login in with valid credentials 
	Given I am on CRM loginpage 
	When I enter  username and password 
		|askbotta@gmail.com|Manoj123@|
		#|nshashidhar18@icloud.com|Shashi123$|
	And I click on login button 
	Then I am able to login to homepage 
	And I fill in company details
	|akjsh|asdasfdsf|asdadsfdas|
	
