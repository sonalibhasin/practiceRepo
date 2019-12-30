Feature: Login functionality 
Background: webpage needs to be loaded
	When open fb in browserr 
	
Scenario: login fb page
	Then enter username and pass
	Then click btn
	
Scenario: enter user name & pass
	Then enter username
	And enter pwd
	
Scenario: login as aunthenticated user 
	Then enter username "7889143616" only
	