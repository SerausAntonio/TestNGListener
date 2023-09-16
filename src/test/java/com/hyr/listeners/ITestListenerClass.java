package com.hyr.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass implements ITestListener {

    @Override
    public void onTestStart(ITestResult result){
        System.out.println("This Test just started");
    }

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Test Success");
    }
    @Override
    public void onTestFailure(ITestResult result){

        System.out.println("This test Fail");
    }
}
