package com.qalens.persona.steps;

import com.qalens.persona.cucumber.TestContext;
import com.qalens.persona.pages.PersonsPage;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class PersonsSteps {
    TestContext testContext;
    PersonsPage personsPage;

    public PersonsSteps(TestContext context) {
        testContext = context;
        personsPage = testContext.getPageObjectManager().getPersonsPage();
    }
    @Then("I see Landing Page")
    public void iSeeLandingPage() {
        assertEquals("List of all Persons",personsPage.getPageTitle());
    }
}
