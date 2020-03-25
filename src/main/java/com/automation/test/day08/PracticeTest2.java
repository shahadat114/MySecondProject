package com.automation.test.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class PracticeTest2 {
    private WebDriver driver;

    public void logInTest(){

    }
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().version("79").setup();
    }
}
