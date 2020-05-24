package com.qalens.persona.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonsPage extends BasePage {
    private By titleLabel =By.id("personsPageTitle");

    public PersonsPage(WebDriver driver){
        super(driver);
    }
    public String getPageTitle(){
        return driver.findElement(titleLabel).getText();
    }
}
