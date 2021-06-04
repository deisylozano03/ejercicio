package com.theinternet.herokuapp.com.automation.steps;

import com.theinternet.herokuapp.com.automation.pageobjects.LatitudePage;
import net.thucydides.core.annotations.Step;

public class LatitudeStep {
        LatitudePage latitudePage = new LatitudePage();

        @Step
        public void shouldLatitude(){
                    latitudePage.textLatitude();
        }
}
