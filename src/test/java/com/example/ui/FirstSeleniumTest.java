package com.example.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstSeleniumTest {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    void checkPageTitle() {
        driver.get("https://example.com");
        String title = driver.getTitle();
        assertEquals("Example Domain", title);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}