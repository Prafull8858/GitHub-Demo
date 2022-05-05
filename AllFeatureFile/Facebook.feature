Feature: Facebook Page login functionality

  Scenario: test user registration functionality
    Given user is on login page
    When user enters valid user name
    And user enters valid password
    Then user sucessfully login
