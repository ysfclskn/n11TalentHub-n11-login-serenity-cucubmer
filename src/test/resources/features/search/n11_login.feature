Feature: n11 login

@login
Scenario: n11 mark login
Given user launch browser and open the main page
When user logged in with valid credentials
Then user logged in successfully