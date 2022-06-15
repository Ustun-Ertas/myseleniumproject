package com.myproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBox {

      WebDriver driver;
    @Before
    public void setUp(){
        //Go to the https://the-internet.herokuapp.com/checkboxes

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

    }

    @Test
    public void checkbox(){

        //locate element for the checkbox
      WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'][1])"));
      WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'][2])"));

      //then click on checkbox1 if box is NOT selected

        if (!checkbox1.isSelected()){
            checkbox1.click();

        }
        //then click on checkbox2 if box is NOT selected

        if (!checkbox2.isSelected()){
            checkbox2.click();
        }

        //Then verify that checbox1 is checked

        Assert.assertTrue(checkbox1.isSelected());

    }
}
