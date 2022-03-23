package com.yelpcamp.stepdefinitions;

import com.yelpcamp.pageobjects.CampgroundPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class MapBoxDisplayedStep {

    CampgroundPage campgroundPage = new CampgroundPage();

    @And("user can see the map box for all campgrounds")
    public void userCanSeeTheMapBoxForAllCampgrounds() {
        System.out.println(campgroundPage.getMapbox().getText());
        Assert.assertTrue(campgroundPage.getMapbox().isDisplayed());
    }
}
