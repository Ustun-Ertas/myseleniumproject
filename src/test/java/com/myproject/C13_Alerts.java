package com.myproject;

import com.myproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class C13_Alerts extends TestBase {

    @Test
    public void acceptAlerts() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(500);
        String actualAlertText=driver.switchTo().alert().getText();
        String expectedAlertText="I am a JS Alert";
        Assert.assertEquals(expectedAlertText, actualAlertText);

        driver.switchTo().alert().accept();
        Thread.sleep(500);
        String actualResultTest=driver.findElement(By.id("result")).getText();
        String expectedResultText="You successfully clicked an alert";
        Assert.assertEquals(expectedResultText, actualResultTest);
    }
    @Test
    public void dismissAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(500);
        String actualAlertText =driver.switchTo().alert().getText();
        String expectedAlertText="I am a JS Confirm";
        Assert.assertEquals(expectedAlertText,actualAlertText);

        driver.switchTo().alert().dismiss();
        Thread.sleep(500);
        String expectedResultText="You clicked: Cancel";
        String actualResultTest=driver.findElement(By.id("result")).getText();
        Assert.assertEquals(expectedResultText,actualResultTest);

    }
    @Test
    public void sendKeysAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(500);
        Assert.assertEquals("I am a JS prompt",driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Hello World");
        driver.switchTo().alert().accept();
        Thread.sleep(500);
        Assert.assertEquals("You entered: Hello World",driver.findElement(By.id("result")).getText());



    }

}
