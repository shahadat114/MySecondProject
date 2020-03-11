package com.automation.test.day06;

import com.automation.test.day05.DriverFactory;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SlectByIndex {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        Select stateSelect = new Select(driver.findElement(By.id("state")));
        stateSelect.selectByIndex(9);
        BrowserUtils.wait(3);
        driver.quit();
    }
}
