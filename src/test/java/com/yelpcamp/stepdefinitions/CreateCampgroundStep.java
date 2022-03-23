package com.yelpcamp.stepdefinitions;

import com.yelpcamp.pageobjects.CampgroundPage;
import com.yelpcamp.pageobjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateCampgroundStep {

    HomePage homePage = new HomePage();
    CampgroundPage campgroundPage = new CampgroundPage();
    @Given("user is logged in")
    public void userIsLoggedIn() {
        homePage.login();
    }

    @And("go to campground page")
    public void goToCampgroundPage() {
       // campgroundPage.getViewCampgroundButton().click();
    }

    @And("create a new campground")
    public void createANewCampground() throws InterruptedException {
        Thread.sleep(2000);
        campgroundPage.createCampground();

    }

    @Then("a new campground is created")
    public void aNewCampgroundIsCreated() {
    }
}
