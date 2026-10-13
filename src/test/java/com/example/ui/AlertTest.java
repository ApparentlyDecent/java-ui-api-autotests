package com.example.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class AlertTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void checkAlert() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertJS = driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']"));
        alertJS.click();

        driver.switchTo().alert().accept();

        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Актуальный текст: [" + result.getText() + "]");
        assertEquals("You successfully clicked an alert", result.getText());
    }
}