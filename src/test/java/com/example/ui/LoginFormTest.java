package com.example.ui;

import com.example.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginFormTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    void successfulLoginShowsFlashMessage() {
        driver.get("https://the-internet.herokuapp.com/login");

        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();

        assertTrue(loginPage.getFlashMessageText().contains("You logged into a secure area"));
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}