package com.automation.test.day10;

//how to use javaScriptExecutor?
//javaScriptExecutor; it is an interface we can not create object out of it.
//But javascript executor and webDriver are like siblings
//So we will cast driver to JavascriptExecutor
//we convert webDriver object into JavaScriptExecutor
//JavascriptExecutor js = (JavascriptExecutor) driver;
//interface => they don't have implementation
//if you have interface as reference type you can see methods only coming from that interface
//you can not see other methods that are in other interfaces
//so we will use remoteWebDriver class as reference type :
//if you use remoteWebDriver class as reference type you do not need to cast anymore, it has everything
//like this => private RemoteWebDriver driver;
//driver.executeScript("window.scrollBy(0, 250)");
//you need to cast if your reference type is webDriver; like this =>  private WebDriver driver;
//JavascriptExecutor js = (JavascriptExecutor) driver


import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriveFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSExecuteor {
    private WebDriver driver;
 @BeforeMethod
    public void setup(){
     driver= DriveFactory.createDriver("chrome");
 }
 @AfterMethod
    public void teardown(){
     BrowserUtils.wait(3);
     driver.quit();
 }
 @Test
 public void scrollTest() {
     driver.get("http://practice.cybertekschool.com/infinite_scroll");
     driver.manage().window().maximize();
     JavascriptExecutor js = (JavascriptExecutor) driver;// caste the driver object to javascriptExecuter
for (int i=0;i<10;i++){
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
    BrowserUtils.wait(3);
  }
    BrowserUtils.wait(3);
   }
   @Test
   public void scrollToElementTest(){
       driver.get("http://practice.cybertekschool.com/");
       driver.manage().window().maximize();
       WebElement link=driver.findElement(By.linkText("Cybertek School"));
       //scrollIntoView - javascript method
       //arguments[0] - means 1st webelement after comma
     //  driver.executeScript("arguments[0].scrollIntoView(true)", link);
   }
}