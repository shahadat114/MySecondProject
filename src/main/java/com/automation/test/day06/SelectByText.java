package com.automation.test.day06;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectByText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        WebElement simpleDropDown=driver.findElement(By.id("dropdown"));
        Select selectSimpleDropDown=new Select(simpleDropDown);
        selectSimpleDropDown.selectByVisibleText("Option 1");
        System.out.println("option 1 selected");
        BrowserUtils.wait(2);
        selectSimpleDropDown.selectByVisibleText("Option 2");
        System.out.println("option 2 selected");
        Select selectYear=new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("2003");
        BrowserUtils.wait(1);
        System.out.println("select year");
        Select selectMonth=new Select(driver.findElement(By.id("month")));
        selectMonth.selectByVisibleText("January");
        BrowserUtils.wait(1);
        System.out.println("select month");
        Select selectDay=new Select(driver.findElement(By.id("day")));
        selectDay.selectByVisibleText("1");
        BrowserUtils.wait(1);
        System.out.println("select day");
        BrowserUtils.wait(1);
        List<WebElement> months=selectMonth.getOptions();
        for (WebElement eachMonth:months){
            selectMonth.selectByVisibleText(eachMonth.getText());
            System.out.println(eachMonth.getText());
            BrowserUtils.wait(1);
        }
        BrowserUtils.wait(5);
        Select stateSelect=new Select(driver.findElement(By.id("state")));
        stateSelect.selectByVisibleText("Kansas");
        //option that is currently selected
        //getFirstSelectedOption() -- returns a webelement, that's why we need to call getText() method
        // getText() retrieves visible text from the webelement
        String selected = stateSelect.getFirstSelectedOption().getText();
        if (selected.equals("Kansas")){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        List<WebElement> month= selectMonth.getOptions();
        for(WebElement eachMonth: months){
            //get the month name and select based on that
            String monthName = eachMonth.getText();
            selectMonth.selectByVisibleText(monthName);
            BrowserUtils.wait(1);
        }
        BrowserUtils.wait(3);
        driver.quit();
    }
}
