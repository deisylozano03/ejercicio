package com.theinternet.herokuapp.com.automation.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://the-internet.herokuapp.com/geolocation")
public class GeolocationPage extends PageObject {

        public By WhereAmIButton = By.xpath("//*[@id=\"content\"]/div[1]/button[1]");

        public void clickWhereAmI() {
            getDriver().findElement(WhereAmIButton).click();

    }
}
