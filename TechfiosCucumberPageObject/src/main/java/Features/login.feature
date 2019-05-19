Feature: Free CRM Login Feature

#with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When user enters "<username>" and "<password>"
Then Close the browser


Examples:
	| username | password |
	| techfiosdemo@gmail.com  | abc123 |