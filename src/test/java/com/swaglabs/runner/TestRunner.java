package com.swaglabs.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        // plugin is for showing all reports
        plugin = {"pretty", "html:target/site/cucumber-pretty.html"},

        snippets = CucumberOptions.SnippetType.CAMELCASE,

        // Specify step definition package path to connect with feature file
        glue = {"com/swaglabs/stepdefinitions"},

        features = {"src/test/resources/features"},

        tags = "@checkout",  // you can change it to @login and run that part

        // checking if the steps are defined or not
        dryRun = false,

        monochrome = true
)
public class TestRunner {
}
