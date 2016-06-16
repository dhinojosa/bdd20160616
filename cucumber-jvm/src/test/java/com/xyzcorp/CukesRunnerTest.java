package com.xyzcorp;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:target/site/cucumber-html-report",
        "progress:target/site/cucumber-progress-report"},
        features = "src/test/resources")
public class CukesRunnerTest {
}