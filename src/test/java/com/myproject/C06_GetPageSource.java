package com.myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_GetPageSource {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to amazon homapage
        driver.get("https://www.amazon.com");

        //Test if amazon contains "Registry" on the homepage
        String pageSource=driver.getPageSource();
        System.out.println(pageSource);

        if (pageSource.contains("Registry")){
            System.out.println("PASSED");

        }else{
            System.out.println("FAILED");

        }
        driver.quit();
    }
}
