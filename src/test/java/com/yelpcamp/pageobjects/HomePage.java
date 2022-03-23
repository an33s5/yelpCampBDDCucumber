package com.yelpcamp.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.yelpcamp.base.Base.driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[href=\"/login\"]")
    WebElement loginHeaderLink;


    @FindBy(css = "[id=\"username\"]")
    WebElement usernameTextField;

    @FindBy(css = "[id=\"password\"]")
    WebElement passwordTextField;

    @FindBy(css = "[class=\"btn btn-success btn-block\"]")
    WebElement loginBtn;

    @FindBy(css = "[href=\"/logout\"]")
    @Getter
    WebElement logoutBtn;


    public void login() {
        loginHeaderLink.click();
        usernameTextField.sendKeys("qwerty5");
        passwordTextField.sendKeys("123456");
        loginBtn.click();

    }
}
