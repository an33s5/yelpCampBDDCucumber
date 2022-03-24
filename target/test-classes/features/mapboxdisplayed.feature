Feature: Map box is Displayed


  Map box should be displayed in the campground page


  @mapbox
  Scenario: Map box is displayed

    Given user goes to campgrounds page
    And user can see the map box for all campgrounds
