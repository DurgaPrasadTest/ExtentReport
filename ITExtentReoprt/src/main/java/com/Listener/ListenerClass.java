package com.Listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ExtentManger.ExtentMangerClass;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.baseClass.BaseClass;

public class ListenerClass extends ExtentMangerClass implements ITestListener  {

	public void onTestStart(ITestResult result) {
		extentTest=extentReport.createTest(result.getName());
		 }
		 public void onTestSuccess(ITestResult result) {
			  if(result.getStatus()==ITestResult.SUCCESS) {
				  extentTest.log(Status.PASS, "Pass Test case is: "+result.getName());
			  }
		  
		 }
		 public void onTestFailure(ITestResult result) {
			 if(result.getStatus()==ITestResult.FAILURE) {
				  extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
				  extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			   
			   String pathString=BaseClass.screenShot(driver, result.getName());
			   try {
				extentTest.addScreenCaptureFromPath(pathString);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
			  } 
		  
		 }

		 public void onTestSkipped(ITestResult result) {
			  if(result.getStatus()==ITestResult.SKIP) {
				  extentTest.log(Status.SKIP, "Skipped Test case is: "+result.getName());
			  } 
		  
		 }
		 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		  // TODO Auto-generated method stub
		 }
		 public void onStart(ITestContext context) {
		  // TODO Auto-generated method stub

		 }
		 public void onFinish(ITestContext context) {
		  // TODO Auto-generated method stub
		 }
}
