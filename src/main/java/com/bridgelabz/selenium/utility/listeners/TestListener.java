package com.bridgelabz.selenium.utility.listeners;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.utility.CaptureScreenshot;
import com.bridgelabz.selenium.utility.Log;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends BaseClass implements ITestListener {

    CaptureScreenshot captureScreenshot = new CaptureScreenshot();
    //onTestFailure method is used when test is failed it will take screenshot automatically
    public void onTestFailure(ITestResult result) {
        System.out.println("Method failed " + result.getName());
        Log.warn("Test is failed" );
        captureScreenshot.captureScreenshot(result.getName(), "failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Log.warn(result.getName() + "Test is skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        Log.debug(result.getName() + "Test is failing but within some success percentage");

    }

    @Override
    public void onStart(ITestContext context) {


    }

    public void onFinish(ITestContext context) {
        Log.info(context.getName() + "Test is finished");
    }

    public void onTestStart(ITestResult result) {
        Log.info(result.getName() + "Test is starting");
    }

    //onTestSuccess method is used when test is passed it will take screenshot automatically
    public void onTestSuccess(ITestResult result) {
        System.out.println("Method passed " + result.getName());
        Log.info("Test is successfully passed");
        captureScreenshot.captureScreenshot(result.getName(), "success");
    }
}
