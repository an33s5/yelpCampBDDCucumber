package com.yelpcamp.stepdefinitions;

import com.yelpcamp.base.Base;
import com.yelpcamp.pageobjects.CampgroundPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class CampGroundsLoadedStep {

    CampgroundPage campgroundPage = new CampgroundPage();

    @Given("user goes to campgrounds page")
    public void userGoesToCampgroundsPage() {
        campgroundPage.getViewCampgroundButton().click();
    }

    @And("user can see all campgrounds are listed")
    public void userCanSeeAllCampgroundsAreListed() {
        Assert.assertTrue(campgroundPage.campgroundsLoaded());
    }
}
