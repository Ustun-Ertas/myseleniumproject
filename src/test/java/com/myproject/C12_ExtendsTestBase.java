package com.myproject;

import com.myproject.utilities.TestBase;
import org.junit.Test;

public class C12_ExtendsTestBase extends TestBase {

    @Test

    public void test1(){
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void test2(){
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
    }
}
