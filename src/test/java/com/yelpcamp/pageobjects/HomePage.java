package com.yelpcamp.pageobjects;

import com.yelpcamp.base.PageObject;
import lombok.Getter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.yelpcamp.base.Base.driver;

public class HomePage extends PageObject {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[href='/login']")
    WebElement loginHeaderLink;

    @FindBy(css = "[id='username']")
    WebElement usernameTextField;

    @FindBy(css = "[id='password']")
    WebElement passwordTextField;

    @FindBy(css = "[class='btn btn-success btn-block']")
    WebElement loginBtn;

    @FindBy(css = "[href='/logout']")
    @Getter
    WebElement logoutBtn;

    @FindBy(css = "[href=\"/register\"]")
    @Getter
    WebElement registerHeaderLink;

    @FindBy(id = "email")
    WebElement emailTextField;

    @FindBy(css = "form > div.d-grid.gap-2 > button")
    WebElement registerBtn;

    @FindBy(css = "[role=\"alert\"]")
    @Getter
    WebElement welcomeAlert;

    public void login() {
        loginHeaderLink.click();
        usernameTextField.sendKeys("qwerty5");
        passwordTextField.sendKeys("123456");
        loginBtn.click();
    }

    public void registerWithNewAccount() {
        usernameTextField.sendKeys("helloqwertys1");
        emailTextField.sendKeys("tigoga@f1xm.com");
        passwordTextField.sendKeys("1234567");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 500)");
        waitInSeconds(1);
        registerBtn.click();
    }
}
