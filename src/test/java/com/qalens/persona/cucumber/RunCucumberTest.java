package com.qalens.persona.cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"pretty"},
        features = "src/test/java/com/qalens/persona/features",
        glue={"com/qalens/persona/steps","com/qalens/persona/hooks"}
)
public class RunCucumberTest {
}
