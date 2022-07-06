package com.fleetgru.step_definitions;

import com.fleetgru.pages.DashboardPage;
import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.QuickLaunchpadPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDef {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the truck driver user enters username {string}")
    public void theTruckDriverUserEntersUsername(String username) {
        loginPage.usernameBox.sendKeys(username);
    }

    @And("the truck driver user enters password {string}")
    public void theTruckDriverUserEntersPassword(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @And("the truck driver user clicks enter or login button")
    public void theTruckDriverUserClicksEnterOrLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("the truck driver user can see Quick Launchpad page")
    public void theTruckDriverUserCanSeeQuickLaunchpadPage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(loginPage.loadingBar));
       String actualPage = quickLaunchpadPage.quickLaunchpad.getText();
       String expectedPage = "Quick Launchpad";
       Assert.assertEquals(expectedPage,actualPage);
    }

    @When("the sales manager or store manager user enters username {string}")
    public void theSalesManagerOrStoreManagerUserEntersUsername(String username) {
        loginPage.usernameBox.sendKeys(username);
    }

    @And("the sales manager or store manager user enters password {string}")
    public void theSalesManagerOrStoreManagerUserEntersPassword(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @And("the sales manager or store manager user clicks enter or login button")
    public void theSalesManagerOrStoreManagerUserClicksEnterOrLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("the sales manager or store manager user can see Dashboard page")
    public void theSalesManagerOrStoreManagerUserCanSeeDashboardPage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(loginPage.loadingBar));
        String actualPagePart = dashboardPage.dashboard.getText();
        String expectedPagePart = "Dashboard";
        Assert.assertEquals(expectedPagePart,actualPagePart);
    }

    @When("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String string1, String string2) {
        loginPage.usernameBox.sendKeys(string1);
        loginPage.passwordBox.sendKeys(string2);
    }

    @When("the user clicks enter or login button")
    public void the_user_clicks_enter_or_login_button() {
        loginPage.loginButton.click();
    }

    @Then("the user should see warning message")
    public void the_user_should_see_warning_message() {
        String actualMessage = loginPage.invalidCredentialsMessage.getText();
        String expectedMessage = "Invalid user name or password.";
        Assert.assertEquals(expectedMessage,actualMessage);
    }


}
