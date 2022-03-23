package com.yelpcamp.stepdefinitions;

import com.yelpcamp.pageobjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStep {
    HomePage homePage =  new HomePage();

    @Given("user has a valid user account")
    public void userHasAValidUserAccount() {
    }

    @When("he enters valid login credentials")
    public void heEntersValidLoginCredentials() {
        homePage.login();

    }

    @Then("he should be able to login")
    public void heShouldBeAbleToLogin() {
        Assert.assertTrue(homePage.getLogoutBtn().getText().contains("Logout"));
    }
}
