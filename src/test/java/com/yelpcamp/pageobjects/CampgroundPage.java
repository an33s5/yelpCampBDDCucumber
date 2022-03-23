package com.yelpcamp.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.yelpcamp.base.Base.driver;

public class CampgroundPage {

    public CampgroundPage(){
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "div:nth-child(3) > div > div.col-md-8 > div > h5")
    WebElement peekymountainTitle;

    @FindBy(css = "div:nth-child(4) > div > div.col-md-8 > div > h5")
    WebElement yellowCornerTitle;

    @FindBy(css = "[class=\"btn btn-lg btn-secondary font-weight-bold border-white bg-white\"]")
    @Getter
    WebElement viewCampgroundButton;

    @FindBy(css = "[id=\"cluster-map\"]")
    @Getter
    WebElement mapbox;

    @FindBy(css = "[class=\"navbar-toggler-icon\"]")
    WebElement burgerBtn;

    @FindBy(css = "[href=\"/campgrounds/new\"]")
    WebElement newCampground;

    @FindBy(css = "[id=\"title\"]")
    WebElement titleTextField;

    @FindBy(css = "[id=\"location\"]")
    WebElement locationTextField;

    @FindBy(css = "[id=\"price\"]")
    WebElement priceTextField;

    @FindBy(css = "[id=\"description\"]")
    WebElement descriptionTextField;

    @FindBy(css = "[type=\"submit\"]")
    WebElement addCampgroundBtn;

    @FindBy(css = "[href=\"/campgrounds\"]")
    WebElement campgroundBtn;


    public boolean campgroundsLoaded() {
        if (peekymountainTitle.getText().contains("Peeky")) {
            if (yellowCornerTitle.getText().contains("Yellow")) {
                return true;
            }
        }
        return false;

    }

    public void createCampground(){
       // burgerBtn.click();
        newCampground.click();
        titleTextField.sendKeys("Carnage Call");
        locationTextField.sendKeys("Miami");
        priceTextField.sendKeys("78");
        descriptionTextField.sendKeys("Carnage has a campground now.");
        addCampgroundBtn.click();
        //burgerBtn.click();
        campgroundBtn.click();



    }

}
