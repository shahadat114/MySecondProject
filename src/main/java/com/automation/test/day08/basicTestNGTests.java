package com.automation.test.day08;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basicTestNGTests {
    @BeforeMethod
    public  void setup(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void tearndown(){
        System.out.println("After Method ");
    }
    @Test
    public void test1(){
        String expected="apple";
        String actual="apple";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test2(){
        int num1=5;
        int num2=10;
        Assert.assertTrue(num1<num2);
    }


}
