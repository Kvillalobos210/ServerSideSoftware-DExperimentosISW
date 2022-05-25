package com.appdhome.system.cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = "src/test/java/com/appdhome/system/features/US16.feature",
        //path of step definition file
        glue = "US16")
public class TestRunner {
}
