package com.automation.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriveFactory {

public static WebDriver createDriver(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            //to fix [1583364253.062][SEVERE]: Timed out receiving message from renderer: 0.100
            WebDriverManager.chromedriver().version("79.0").setup();
            return new ChromeDriver();
        }else{
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
    }

}
