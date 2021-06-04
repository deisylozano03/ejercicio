package com.theinternet.herokuapp.com.automation.stepdefinitions;


import com.theinternet.herokuapp.com.automation.steps.GeolocationStep;
import com.theinternet.herokuapp.com.automation.steps.HomeStep;
import com.theinternet.herokuapp.com.automation.steps.LatitudeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GeolocationStepDefinition {
    @Steps
    HomeStep homeStep;

    @Steps
    GeolocationStep geolocationStep;

    @Steps
    LatitudeStep latitudeStep;



    @Given("^Login to Geolocation$")
    public void LoginToLocation()  {
        homeStep.openBrowser();
        homeStep.selectGeolocation();

    }

    @When("^Click in Where Am I$")
    public void ClickInWhereAmI() {
        geolocationStep.selectWhereAmI();
    }

    @Then("^Latitude$")
    public void Latitude() {
        latitudeStep.shouldLatitude();
    }
}
