package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_VerifyURLTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        //Verify if facebook homepage url is "www.facebook.com"

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.facebook.com";

        if (actualURL.equals(expectedURL)) {
            System.out.println("PASSED");

        } else {
            System.out.println("FAILED");
            System.out.println("ACTUAL :" + actualURL);
            System.out.println("EXPECTED :" + expectedURL);
        }
        driver.quit();
    }
}