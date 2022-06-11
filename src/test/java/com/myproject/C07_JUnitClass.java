package com.myproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class C07_JUnitClass {

    @Before
    public void SetUp(){
        System.out.println("BEFORE METHOD");
    }

    @After
    public void tearDown(){
        System.out.println("AFTER METHOD");
    }

    @Test
    public void test1(){
        System.out.println("This is test 1");

    }

    @Test
    public void test2(){
        System.out.println("This is test 2");

    }
    @Ignore
    @Test
    public void test3(){
        System.out.println("This is test 1");

    }

    @Test
    public void test4(){
        System.out.println("This is test 2");

    }
}
