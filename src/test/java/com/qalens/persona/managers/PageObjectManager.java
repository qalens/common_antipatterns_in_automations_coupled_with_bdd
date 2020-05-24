package com.qalens.persona.managers;

import com.qalens.persona.pages.LoginPage;
import com.qalens.persona.pages.PersonsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectManager extends BrowserManager {
    private LoginPage loginPage;
    private PersonsPage personsPage;

    public PageObjectManager() {
        super();
    }
    public LoginPage getLoginPage(){
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }
    public PersonsPage getPersonsPage(){
        return (personsPage == null) ? personsPage = new PersonsPage(driver) : personsPage;
    }
}
