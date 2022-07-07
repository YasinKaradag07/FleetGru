package com.fleetgru.step_definitions;

import com.fleetgru.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import net.masterthought.cucumber.ReportBuilder;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.ArrayList;
import java.util.List;

public class Hooks {

    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() ==> if scenario fails this method will return TRUE boolean value

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        Driver.closeDriver();
    }



}
