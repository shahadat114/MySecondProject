package com.automation.test.day06;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SlectByTextMultipleOptions {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        Select languageSelect=new Select(driver.findElement(By.name("Languages")));

        boolean isMultiple=languageSelect.isMultiple();
        System.out.println(isMultiple);

        languageSelect.selectByVisibleText("java");
        languageSelect.selectByVisibleText("javaScript");
        languageSelect.selectByVisibleText("Python");


        BrowserUtils.wait(3);
        driver.quit();
    }
}
