package com.fleetgru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickLaunchpadPage extends BasePage{

    @FindBy(xpath = "//h1[.='Quick Launchpad']")
    public WebElement quickLaunchpad;

}
