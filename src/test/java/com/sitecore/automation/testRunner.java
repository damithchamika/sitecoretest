package com.sitecore.automation;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features/1/Banking/",
        glue = {"com.sitecore.automation.testStepDefinition"}
        , plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json"}, monochrome = true, strict = true)


public class testRunner {
}
