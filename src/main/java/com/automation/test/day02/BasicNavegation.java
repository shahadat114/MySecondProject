package com.automation.test.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

class BasicNavigation {
    public static void main(String[] args) throws Exception{
        //to start selenium script we need:
        //setup webdriver (browser driver) and create webdriver object
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriverManager.chromedriver().setup();
         ChromeDriver driver = new ChromeDriver();
        //In selenium, everything starts from WebDriver interface'
        //ChromeDriver extends RemoteWebDriver --> implements WebDriver
        driver.get("http://google.com");//to open a website
        System.out.println(driver.getTitle());
       // driver.manage().window().fullscreen();//to maximize browser
        driver.manage().window().maximize();//to maximize browser
       //driver.manage().window().fullscreen();
         Thread.sleep(3000); //for demo, wait 3 seconds
        String title=driver.getTitle(); //return<title>
        String expectedTitle="Google"; // we provid it

        System.out.println("Title is ...."+title);
        if (expectedTitle.equals(title)){
            System.out.println("Test Passed !");
        }else{
            System.out.println("test Failed !");
        }
        //go to another webside within the same window
        driver.navigate().to("http://amazon.com");
        if (driver.getTitle().toLowerCase().contains("amazon")){
            System.out.println("Test Passed !");
        }else{
            System.out.println("Test Faild !");
        }
        //come back to google
        driver.navigate().back();
        //checking if page title is equals to Google
        verifyEquals(driver.getTitle(),"Google");
        //move forward in the browser history
        //again going to amazon
        driver.navigate().forward();
        Thread.sleep(3000); //for demo, wait 3 seconds

        System.out.println("Title:"+driver.getTitle());
        System.out.println("URL:"+driver.getCurrentUrl());
        driver.navigate().refresh();
        Thread.sleep(3000); //for demo, wait 3 seconds

        //method that return page title
        //you can also see it as tab name, in the browser
         driver.close(); //to close browser,browser cannot close itself
    }
    public  static  void verifyEquals(String arg1,String arg2){
        if (arg1.equals(arg2)){
            System.out.println("Test Passed !");
        }else{
            System.out.println("Test Faild !");
        }
    }
}
