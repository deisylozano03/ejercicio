package com.theinternet.herokuapp.com.automation.steps;

import com.theinternet.herokuapp.com.automation.pageobjects.GeolocationPage;
import net.thucydides.core.annotations.Step;

public class GeolocationStep {

       GeolocationPage geolocationPage= new GeolocacatioPage();

        @Step
        public void selectWhereAmI(){
            geolocationPage.clickWhereAmI();
        }

}
