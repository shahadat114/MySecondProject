package com.automation.test.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverFactory {
    public static WebDriver createADriver(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
    }

    public static WebDriver createDriver(String chrome) {
        return null;
    }
}
