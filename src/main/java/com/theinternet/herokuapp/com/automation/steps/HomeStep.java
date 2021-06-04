package com.theinternet.herokuapp.com.automation.steps;

import com.theinternet.herokuapp.com.automation.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeStep {
    HomePage homePage= new HomePage();

    @Step
    public void openBrowser(){
        homePage.setDefaultBaseUrl("https://the-internet.herokuapp.com/");
        homePage.open();
    }

    @Step
    public void selectGeolocation() {
        homePage.clickGeolocationButton();
    }
}
