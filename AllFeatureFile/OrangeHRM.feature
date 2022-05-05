Feature: test Orange HRM functionality
Scenario: test login functionality of HRM Page
Given User is on the login Page
When User ender vaid user name and password
And click on login
Then user is on the home page

Scenario: test PIM page functionality
Given user is on the dashboard page
When user click on PIM tab
Then user is on the PIM page