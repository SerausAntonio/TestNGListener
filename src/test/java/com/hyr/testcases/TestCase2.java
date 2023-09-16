package com.hyr.testcases;

import com.hyr.listeners.ITestListenerClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ITestListenerClass.class})

public class TestCase2 {
    @Test
    public void test1(){
        System.out.println("I am inside test1");
    }
    @Test
    public void test2(){
        System.out.println("I am inside test2");
        Assert.assertTrue(false,"This test miss miserably");
    }
    @Test
    public void test3(){
        System.out.println("I am inside test3");
    }
    @Test
    public void test4(){
        System.out.println("I am inside test4");
    }
}
