package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By flashMessage = By.id("flash");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String value) {
        driver.findElement(usernameField).sendKeys(value);
    }

    public void enterPassword(String value) {
        driver.findElement(passwordField).sendKeys(value);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getFlashMessageText() {
        return driver.findElement(flashMessage).getText();
    }
}