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
        //Navigating to etsy homepage
        driver.get("https://www.etsy.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //  id---- global-enhancements-search-query
        js.executeScript("document.getElementById('global-enhancements-search-query').value='Send these characters'");
    }
    @Test(description="get the page title(return a value)")
    public void testcase3(){
        WebDriver driver=DriveFactory.createDriver("chrome");
        //Navigating to etsy homepage
        driver.get("https://www.etsy.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // return ----is keyword before the script is for selenium to know that it needs to bring back information
        String pageTitle=js.executeScript("return document.title").toString();
        System.out.println(pageTitle);
    }
}