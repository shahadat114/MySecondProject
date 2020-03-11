package com.automation.test.day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class CheckBoxes {
    private static Object BrowserUtils;
    private static Object BrowserUnits;

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        BrowserUtils.wait(5);
        //<input type="checkbox" checked="">
        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));
//        checkBoxes.get(0).click(); // click on first checkbox
        BrowserUtils.wait(2);
        //go over collection of checkboxes
        for (WebElement eachCheckBox : checkBoxes
        ) {
            if (!eachCheckBox.isSelected()) {
                eachCheckBox.click();
            } else {
                System.out.println("already selected");
            }
            BrowserUnits.wait(2);
            driver.quit();
        }
    }
}