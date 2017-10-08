Feature: As a user I want to create a new account for mendeley.com 

Background: 
	Given I am on the Create account page 
	And I click create account link 
	
@AutomatedScenario 
Scenario: Create a new account with correct details - happy path 

	When I enter valid details as follows 
		|	field			| 	value						|
		|	email_address	| 	aaa20298bbbccc212@yahoo.com	|
		| 	firstname		| 	Paul						|
		| 	lastname		| 	Lambert						|
		| 	password		| 	paullambert123				|
		
	And I click continue button 
	And I select a Field of study from the drop down 
	And I select an Academic status from the drop down 
	And I click on Create account button 
	Then "Mendeley Feed" page is displayed 
	
	
	
Scenario: Create account with invalid password - password with 6 characters 
	When I enter details with invalid password as follows 
		|	field			| 	value						|
		|	email_address	| 	aaa20298bbbccc212@yahoo.com	|
		| 	firstname		| 	Paul						|
		| 	lastname		| 	Lambert						|
		| 	password		| 	123456						|
	And I click continue button 
	Then “Password must be at least 7 characters.” Error message Is displayed 
	And I remain on "Join Mendeley" page 
	
	
Scenario: Create account with invalid email address 
	When I enter details with invalid email as follows 
		|	field			| 	value						|
		|	email_address	| 	lateef@yaho					|
		| 	firstname		| 	Paul						|
		| 	lastname		| 	Lambert						|
		| 	password		| 	123456						|
	And I click continue button 
	Then “Not a valid email. Take a closer look.” error message Is displayed 
	And I remain on "Join Mendeley" page 
	
	
	
Scenario: Create account without selecting a Field of study 
	When I enter valid details as follows 
		|	field			| 	value						|
		|	email_address	| 	aaa20298bbbccc212@yahoo.com	|
		| 	firstname		| 	Paul						|
		| 	lastname		| 	Lambert						|
		| 	password		| 	paullambert123				|
	And I select an Academic status from the drop down 
	And I click on Create account button 
	Then “Please select your field of study.” error message should be displayed 
	And I remain on "Join Mendeley" page 
	
	
Scenario: Create account without selecting an Academic status 
	When I enter valid details as follows 
		|	field			| 	value						|
		|	email_address	| 	aaa20298bbbccc212@yahoo.com	|
		| 	firstname		| 	Paul						|
		| 	lastname		| 	Lambert						|
		| 	password		| 	paullambert123				|
	And I select a Field of study from the drop down 
	And I click on Create account button 
	Then “Please select your academic status." error message should be displayed 
	And I remain on "Join Mendeley" page 
	