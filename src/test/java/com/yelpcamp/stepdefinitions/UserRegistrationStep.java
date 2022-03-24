package com.yelpcamp.stepdefinitions;

import com.yelpcamp.pageobjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserRegistrationStep {
    HomePage homePage = new HomePage();

    @Given("user is on registration page")
    public void userIsOnRegistrationPage() {
        homePage.getRegisterHeaderLink().click();
    }

    @When("user registers with valid data")
    public void userRegistersWithValidData() {
        homePage.registerWithNewAccount();
    }

    @Then("his account is created successfully")
    public void hisAccountIsCreatedSuccessfully() {
        Assert.assertTrue(homePage.getWelcomeAlert().getText().contains("Welcome"));
    }
}
