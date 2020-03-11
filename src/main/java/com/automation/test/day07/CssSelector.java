package com.automation.test.day07;

import com.automation.utilities.DriveFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelector {

    public static void main(String[] args) {
        WebDriver driver= DriveFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        WebElement home=driver.findElement(By.cssSelector(".h3"));
        WebElement heading=driver.findElement(By.cssSelector(".nav-link"));

    }
}
