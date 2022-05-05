Feature: test orange hrm functionality

  Scenario: test login functionality
    Given user is on login page
    When user enter valid login credential
    Then user is on home page
