package com.qalens.persona.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private By errorLabel = By.id("loginError");
    private By usernameTextBox =By.id("username");
    private By passwordTextBox =By.id("password");
    private By loginButton =By.id("loginButton");



    public void launch(){
        driver.navigate().to("https://atmnk-swapi.herokuapp.com/login");
    }
    public LoginPage(WebDriver driver){
        super(driver);
    }
    public void enterUsername(String username){
        WebElement usernameElement = driver.findElement(usernameTextBox);
        usernameElement.clear();
        usernameElement.sendKeys(username);
    }
    public void enterPassword(String password){
        WebElement passwordElement = driver.findElement(passwordTextBox);
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }
    public String getErrorMessage(){
        return driver.findElement(errorLabel).getText();
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void tryLogin(String username,String password){
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
