package com.yelpcamp.stepdefinitions;

import com.yelpcamp.pageobjects.CampgroundPage;
import com.yelpcamp.pageobjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CreateCampgroundStep {

    HomePage homePage = new HomePage();
    CampgroundPage campgroundPage = new CampgroundPage();

    @Given("user is logged in")
    public void userIsLoggedIn() {
        homePage.login();
    }

    @And("verify user is on campground page")
    public void verifyUserIsOnCampgroundPage() {
        Assert.assertTrue(campgroundPage.campgroundsLoaded());
    }

    @And("create a new campground")
    public void createANewCampground() {
        campgroundPage.createCampground();
    }

    @Then("a new campground is created")
    public void aNewCampgroundIsCreated() {
        Assert.assertTrue(campgroundPage.getCarnageCallCampground().getText().contains("Carnage"));
    }
}
