Feature: Login

  As the user of the website I should have the option to login


  @login
  Scenario: Login with valid credentials

    When user enters valid login credentials
    Then he should be able to login