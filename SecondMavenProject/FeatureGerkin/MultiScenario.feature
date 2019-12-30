Feature: Login Functionality 
Scenario: Login as validUser 
	When open the webpage1 
	Then enter the emailid 
	Then enter the pas
	And click on loginButton
	
Scenario: Login as invalidUser 
	When open the fb webpage 
	Then enter the wrong username 
	Then enter the pass 
	Then click on login
	
Scenario: Login as InvalidPass 
	When open the fb page 
	Then enter the valid username 
	Then enter the invalid pass
	Then click on button to login