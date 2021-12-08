package com.Agorial.automation.seleniumpages;

import com.Algorial.automation.BasePage;
import com.Algorial.automation.ConfigFileReader;
import com.Algorial.utils.CommonOp;
import com.Algorial.utils.Constants;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends BasePage {
    private CommonOp commonOpObj = null;
    ConfigFileReader configFileReader = null;

    public void launchChromeBrowser() {
        driver.manage().window().maximize();
        configFileReader = new ConfigFileReader();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        NgWebDriver ngDriver = new NgWebDriver(jsDriver);
        driver.get(configFileReader.getApplicationUrl());
        ngDriver.waitForAngularRequestsToFinish();
        commonOpObj = new CommonOp(driver);
    }

    public void clickLoginLink() {

    }

    public void enterEmail(String email) {

    }

    public void enterPassword(String passWord) {

    }

    public void clickLogin() {

    }

    public void logOut() {

    }

}
