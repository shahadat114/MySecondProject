package com.automation.test.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();;
        WebDriver driver=new ChromeDriver();
        driver.get("");
    }
}
