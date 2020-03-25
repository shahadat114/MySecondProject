package com.automation.test.NaveenVedie.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
    public static void main(String[] args) throws  Exception {
      //  WebDriverManager.chromedriver().setup();
     //   System.setProperty("webdriver,chromedriver",System)
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(3000);
        driver.quit();
    }
}
