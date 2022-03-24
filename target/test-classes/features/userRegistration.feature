Feature: User Registers

  As a new user I should be able to create a new account

  @registration
  Scenario: User registration

    Given user is on registration page
    When user registers with valid data
    Then his account is created successfully