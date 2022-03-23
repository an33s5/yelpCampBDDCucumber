Feature: Login

  Scenario: Login with valid credentials

    Given user has a valid user account
    When he enters valid login credentials
    Then he should be able to login