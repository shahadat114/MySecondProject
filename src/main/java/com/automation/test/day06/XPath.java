package com.automation.test.day06;

import com.automation.test.day05.DriverFactory;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPath {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        BrowserUtils.wait(3);
        //value can be inside '' or ""
        //if you don't know the tag name, or want to skip tag name, use *
        //for example //*[@onclick='button1()']  | * means any tag name
        WebElement btn1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        btn1.click();

        WebElement result=driver.findElement(By.id("result"));
        System.out.println(result.getText());

        WebElement btn2 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        btn2.click();
        System.out.println(result.getText());

        BrowserUtils.wait(3);
        driver.quit();
    }
}
