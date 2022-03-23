Feature: Create a new Campground

  Scenario: Create new campground

    Given user is logged in
    And go to campground page
    And create a new campground
    Then a new campground is created