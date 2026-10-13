package com.example.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import static org.junit.jupiter.api.Assertions.*;

public class DropdownTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
    }
    @AfterEach
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void testDropdown(){
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText("Option 2");

        assertEquals("Option 2", dropdown.getFirstSelectedOption().getText());

    }
}