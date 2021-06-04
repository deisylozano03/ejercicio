package com.theinternet.herokuapp.com.automation.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://the-internet.herokuapp.com/")
public class HomePage extends PageObject {

    public By geolocationButton = By.xpath("//*[@id=\"content\"]/ul[1]/li[23]/a[1]");
    public void clickGeolocationButton() {
        getDriver().findElement(geolocationButton).click();
    }
}

