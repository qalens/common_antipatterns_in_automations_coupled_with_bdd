package com.qalens.persona.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
    protected WebDriver driver;
    public BrowserManager(){
        driver = initializeDriver();
    }
    private WebDriver initializeDriver(){
        return new ChromeDriver();
    }
    public void closeBrowser(){
        driver.quit();
    }
}
