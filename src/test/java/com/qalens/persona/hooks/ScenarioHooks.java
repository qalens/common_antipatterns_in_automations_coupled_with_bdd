package com.qalens.persona.hooks;

import com.qalens.persona.cucumber.TestContext;
import io.cucumber.java.After;

public class ScenarioHooks {
    TestContext testContext;

    public ScenarioHooks(TestContext context) {
        testContext = context;
    }

    @After
    public void teardownTestEnvironment() {
        testContext.getPageObjectManager().closeBrowser();
    }
}
