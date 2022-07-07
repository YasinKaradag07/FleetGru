package com.fleetgru.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/Cucumber.json"
        },
        //monochrome = true,
        features = "src/test/resources/features",
        glue = "com/fleetgru/step_definitions",
        dryRun = false,
        tags = "@smoke",
        publish = false
)

public class CukesRunner {
}
