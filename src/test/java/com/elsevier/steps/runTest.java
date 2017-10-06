package com.elsevier.steps;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/features",
				plugin = {"html:target/ReportsDestination", "pretty", "junit:target/junitrep"},
				tags = "@AutomatedScenario"
				)

public class runTest {

}

