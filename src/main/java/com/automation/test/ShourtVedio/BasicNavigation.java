package com.automation.test.ShourtVedio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Throwable{
        WebDriverManager.chromedriver().setup(); //to set up chrome driver
        ChromeDriver driver=new ChromeDriver();  //to create an object of ChromeDriver
        String url="http://google.com";
        String url2="http://amazon.com";
        driver.get(url); //will open browser with url

        Thread.sleep(3000); //will put on hold current run on 3 second
        driver.navigate().to(url2); //navigate to the amazon.com
        Thread.sleep(3000);
        driver.navigate().back();  //will navigate back to the previus URL: google .com
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();  //will close web browser

    }
}
