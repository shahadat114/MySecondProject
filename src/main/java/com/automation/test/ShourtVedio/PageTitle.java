package com.automation.test.ShourtVedio;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
       // WebDriverManager.chromedriver().setup(); //to set up chrome driver
        WebDriver driver=new ChromeDriver();
         driver.get("http://practice.cybertekschool.com/open_new_tab");
       // driver.get("http://google.com");
        Thread.sleep(4000);
//        driver.manage().window().fullscreen();
//        String  title=driver.getTitle();
//        System.out.println(title);
        driver.close();
    }
}
