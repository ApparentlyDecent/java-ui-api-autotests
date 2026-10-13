package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage {

    private WebDriver driver;

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    public List<WebElement> getCheckboxes(){
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));
        return checkboxes;
    }

    public void clickCheckbox(int index){
        getCheckboxes().get(index).click();
    }

    public Boolean checkState(int index){
        return getCheckboxes().get(index).isSelected();
    }
}