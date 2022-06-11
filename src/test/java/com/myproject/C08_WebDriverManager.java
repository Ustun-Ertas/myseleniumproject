package com.myproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_WebDriverManager {

    @Test

    public void googleSearch(){

        //Calling and setting up chromedriver
        WebDriverManager.chromedriver().setup();

        //Create chrome driver
        WebDriver driver = new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        //open google home page "htpps://www.google.com"

        driver.get("https://www.google.com");

        Assert.assertTrue(driver.getTitle().equals("Google"));

    }
}
