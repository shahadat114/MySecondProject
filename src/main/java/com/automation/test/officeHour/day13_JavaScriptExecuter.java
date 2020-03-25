package com.automation.test.officeHour;

import com.automation.utilities.DriveFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class day13_JavaScriptExecuter {
    @Test(description = "Send text to search box on etsy")
    public void test1() {
        //Driver instance created
        WebDriver driver = DriveFactory.createDriver("chrome");    //Navigating to etsy homepage
        driver.get("https://www.etsy.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('global-enhancements-search-query').value='Send these characters'");
    }
}