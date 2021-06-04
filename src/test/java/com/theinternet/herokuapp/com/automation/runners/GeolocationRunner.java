package com.theinternet.herokuapp.com.automation.runners;


import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/geolocation.feature",
        glue = "com.theinternet.herokuapp.com.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class GeolocationRunner {
}
