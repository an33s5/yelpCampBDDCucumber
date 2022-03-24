package com.yelpcamp.cukersrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features",
        glue = "com/yelpcamp",
        tags = "@login",
        dryRun = false,
        plugin = {"pretty","html:target/cucumber-reports.html"},
        monochrome = true
)
public class CukesRunner extends AbstractTestNGCucumberTests {
}
