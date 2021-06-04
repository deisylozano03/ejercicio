package com.theinternet.herokuapp.com.automation.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class LatitudePage extends PageObject {


   public By Latitude = (By) By.xpath("//*[@id=\"lat-value\"]");

    public String textLatitude() {
        return getDriver().findElement(Latitude).getText();
    }
}