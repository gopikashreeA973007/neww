Feature: test registration functionality
Scenario: test registration with valid inputs
Given user launches the chrome browser
When User navigates to registration page
And User enters the username
And User enters the password
And User enters the confirm pawwsord
And User clicks on submit button
Then verify registration success


