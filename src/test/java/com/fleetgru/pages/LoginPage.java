package com.fleetgru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "prependedInput")
    public WebElement usernameBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='bar']")
    public WebElement loadingBar;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement invalidCredentialsMessage;

}
