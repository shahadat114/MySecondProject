package day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
class BasicNavigation {
    public static void main(String[] args) throws Exception{
        //to start selenium script we need:
        //setup webdriver (browser driver) and create webdriver object
        WebDriverManager.chromedriver().setup();
         ChromeDriver driver = new ChromeDriver();
        //In selenium, everything starts from WebDriver interface'
        //ChromeDriver extends RemoteWebDriver --> implements WebDriver
        driver.get("http://google.com");//to open a website
        driver.manage().window().maximize();//to maximize browser
       //driver.manage().window().fullscreen();
         Thread.sleep(3000); //for demo, wait 3 seconds
        String title=driver.getTitle(); //return<title>
        String expectedTitle="Google";

        System.out.println("Title is ...."+title);
        if (expectedTitle.equals(title)){
            System.out.println("Test Passed !");
        }else{
            System.out.println("test Failed !");
        }
        //method that return page title
        //you can also see it as tab name, in the browser
         driver.close(); //to close browser,browser cannot close itself
    }
}
