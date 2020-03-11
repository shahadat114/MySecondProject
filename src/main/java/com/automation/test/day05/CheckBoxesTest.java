package com.automation.test.day05;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBoxesTest {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        //#TASK
        //verify that 1st checkbox is not selected and 2nd is se
        BrowserUtils.wait(4);
    }
}
