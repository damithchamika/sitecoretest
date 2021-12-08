package com.Algorial.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasePage {

    public static WebDriver driver;

    ConfigFileReader configFileReader = new ConfigFileReader();

    public BasePage() {
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());

        if (driver == null) {
            driver = new ChromeDriver();
        }
    }

}
