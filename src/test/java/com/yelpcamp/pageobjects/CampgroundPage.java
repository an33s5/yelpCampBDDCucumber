package com.yelpcamp.pageobjects;

import com.yelpcamp.base.PageObject;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.yelpcamp.base.Base.driver;

public class CampgroundPage extends PageObject {

    public CampgroundPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//h5[text()='Peeky Mountain ']")
    WebElement peekyMountainTitle;

    @FindBy(xpath = "//h5[text()='Yellow Corner ']")
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

    @FindBy(xpath = "//h5[text()='Carnage ']")
    @Getter
    WebElement carnageCallCampground;


    public boolean campgroundsLoaded() {
        waitInSeconds(1);
        if (peekyMountainTitle.getText().contains("Peeky")) {
            if (yellowCornerTitle.getText().contains("Yellow")) {
                return true;
            }
        }
        return false;

    }

    public void createCampground() {
        waitInSeconds(1);
        newCampground.click();
        titleTextField.sendKeys("Carnage");
        locationTextField.sendKeys("Miami");
        priceTextField.sendKeys("78");
        descriptionTextField.sendKeys("Carnage has a campground now.");
        addCampgroundBtn.click();
        campgroundBtn.click();
    }

}
