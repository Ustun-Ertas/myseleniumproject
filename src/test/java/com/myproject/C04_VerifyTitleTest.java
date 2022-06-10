package com.myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyTitleTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Navigate to amazon homapage
        driver.get("https://www.amazon.com");

        //verify of amazon tittle is "Spend less. Smile more."
        String actualTitle=driver.getTitle();
        String expectedTitle="Spend less. Smile more.";

        //verify if expected equals actual

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
            System.out.println("Expected:" +expectedTitle);
            System.out.println("Actual :"+actualTitle);
        }else {
            System.out.println("FAILED");
            System.out.println("Expected :" +expectedTitle);
            System.out.println("Actual :"+ actualTitle);
        }
        driver.quit();
    }
}
