Feature: Login tests for CRM website

 
#Scenario: User able to login in with valid credentials 
#	Given I am on CRM loginpage 
#	When I enter username and password 
#	And I click on login button 
#	Then I am able to login to homepage 



#Scenario: User able to login in with valid credentials 
#	Given I am on CRM loginpage 
#	When I enter "askbotta@gmail.com" and "Manoj123@" 
#	And I click on login button 
#	Then I am able to login to homepage 
	
#Scenario: User able to login in with valid credentials 
#	Given I am on CRM loginpage 
#	When I enter "nshashidhar18@icloud.com" and "Shashi123$" 
#	And I click on login button 
#	Then I am able to login to homepage 

Scenario Outline:: User able to login in with valid credentials 
	Given I am on CRM loginpage 
	When I enter "<username>" and "<password>"
	And I click on login button 
	And I click on search and type "<something>"
	Then I am able to login to homepage 
	
	Examples:
		| username 			| password 		|	 	something	|
		|askbotta@gmail.com | Manoj123@ 	|		hello Manoj	|
		|nshashidhar18@icloud.com|Shashi123$| 	hello Shashi|
		
	