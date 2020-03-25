package com.automation.test.NaveenVedie.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest {
    WebDriver driver;
    @BeforeMethod
    public void  setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("http://www.google.com");
    }
    @Test
    public void googleTitleTest(){
        String title=driver.getTitle();
        System.out.println(title);
    }
    @Test(priority = 1)
    public void googleLogoTest(){
        boolean b=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
    }
//    @Test(priority = 3)
//    public void mailLinkTest(){
//        boolean b=driver.findElement(By.linkText("GMail")).isDisplayed();
//    }
    @Test(priority = 2)
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
    @Test
    public void test3() {
        System.out.println("test3");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
