package com.automation.test.NaveenVedie.TestNG;
import org.testng.annotations.*;
public class TestNgBasic {
    /*  @BeforeSuite -- setup system property for chrome
        @BeforeTest-- lanch chrome Browser
        @BeforeClass -- login to app

        @BeforeMethod-- enter URL
        @Test-- google logo test
        @AfterMethod-- logout From app

        @BeforeMethod-- enter URL
        @Test-- Google Title Test
        @AfterMethod-- logout From app

        @BeforeMethod-- enter URL
        @Test-- search Test
        @AfterMethod-- logout From app

        @AfterClass -- Close Browser
        @AfterTest-- delete All Cookies
      */
//Pre-conditions annotations---starting with @Before
    @BeforeSuite  // 1
    public void setup(){
        System.out.println("@BeforeSuite -- setup system property for chrome");
    }
    @BeforeTest    // 2
    public  void lanchBrowser(){
        System.out.println("@BeforeTest-- lanch chrome Browser  ");
    }
    @BeforeClass  // 3
    public void login(){
        System.out.println(" @BeforeClass -- login to app ");
    }
    @BeforeMethod  // 4
    public void enterURL(){
        System.out.println("@BeforeMethod-- enter URL ");
    }
    // test cases---starting with @Test
    @Test   // 5
    public void googleTitleTest(){
        System.out.println("@Test-- Google Title Test");
    }
    @Test
    public  void searchTest(){
        System.out.println("@Test-- search Test");
    }
    @Test
    public  void googleLogoTest(){
        System.out.println("@Test-- google logo test");
    }
    // Post conditions---starting with @After
    @AfterMethod
    public  void logOut(){  // 6
        System.out.println(" @AfterMethod-- logout From app ");
    }
    @AfterClass    // 7
    public void closeBrowser(){
        System.out.println(" @AfterClass -- Close Browser ");
    }
    @AfterTest   // 8
    public  void deleteAllCookies(){ // 7
        System.out.println("@AfterTest-- delete All Cookies ");
    }
  //  @AfterSuite    // 9
    //public void generateTestReport(){
      //  System.out.println("generate Test Report ");
    }

