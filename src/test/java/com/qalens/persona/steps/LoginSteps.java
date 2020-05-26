package com.qalens.persona.steps;

import com.qalens.persona.cucumber.TestContext;
import com.qalens.persona.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    TestContext testContext;
    LoginPage loginPage;

    public LoginSteps(TestContext context) {
        testContext = context;
//        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @Given("Create Commnity")
    public void iAmOnLoginPage() {

        testContext.communityId = "dadasdas";
    }

    @When("I enter username {string} and password {string} and try to log in")
    public void iEnterUsernameAndPasswordAndTryToLogin(String username, String password) {
        System.out.println(testContext.communityId);
    }

    @Then("I see error message {string}")
    public void iSeeErrorMessage(String errorMessage) {
        assertEquals(errorMessage,loginPage.getErrorMessage());
    }
}
