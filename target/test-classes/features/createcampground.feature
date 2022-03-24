Feature: Create a new Campground

  User should be able to create a campground

  @createCampground
  Scenario: Create new campground

    Given user is logged in
    And verify user is on campground page
    And create a new campground
    Then a new campground is created