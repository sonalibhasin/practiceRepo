Feature: login functionality with multiple data one time 
Scenario Outline: testing with the different client credentials 
	Then open the fb login page
	Then enter the "<username>" in user name
	Then enter the "<pwd>" in password
	Examples:
	|username|pwd|
	|sonali@bhasin.com|sonali|
	|7889134562|sonali123|
	|7666789690|priyanka|
	|7899665509|seerat|
	|5678888754|samyara|