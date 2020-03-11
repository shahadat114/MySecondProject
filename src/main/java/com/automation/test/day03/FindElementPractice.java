package com.automation.test.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementPractice {
    public static void main(String[] args) throws Exception{
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        WebDriver driver =DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("Mister Twister");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("sdet@cybertek.com");
        Thread.sleep(2000);
        WebElement signUp = driver.findElement(By.name("wooden_spoon"));
        //when you see type="submit", you can use submit() instead of click()
        //it make sense to use when click() method doesn't work
        signUp.submit();
        Thread.sleep(2000);
        driver.quit();//to close everything
    }
}

