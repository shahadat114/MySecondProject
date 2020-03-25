package com.automation.test.day13;

import org.testng.annotations.Test;

public class SysteamProperties {
    @Test
    public void test(){
        System.out.println(System.getProperty("user.dir"));
        //System.getProperty("user.dir"+"/pom.xml"
        //C:\Users\susha\Desktop\Fall2019Selinium\pom.xml
        System.out.println(System.getProperty("os.name"));
        //System.getProperty("user.home")+"/Downloads")
        System.out.println(System.getProperty("user.home"));
      //for windows,use \\instead of/
        String pathToDownloads=System.getProperty("user.home")+"/Downloads";
        System.out.println((pathToDownloads));// this path work for everyone

        System.out.println(System.getProperty("os.arch"));
        //https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html

    }
}
