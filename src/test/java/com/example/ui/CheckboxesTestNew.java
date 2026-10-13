package com.example.ui;

import com.example.pages.CheckboxesPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CheckboxesTestNew {

    private WebDriver driver;
    CheckboxesPage checkboxesPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        checkboxesPage = new CheckboxesPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void checkboxesTestNew(){
        checkboxesPage.openPage();
        checkboxesPage.clickCheckbox(0);
        assertTrue(checkboxesPage.checkState(0));
    }
    @Test
    public void checkboxesTestNew2(){
        checkboxesPage.openPage();
        checkboxesPage.clickCheckbox(1);
        assertFalse(checkboxesPage.checkState(1));
    }
}
