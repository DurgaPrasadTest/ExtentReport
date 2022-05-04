package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ExtentManger.ExtentMangerClass;
import com.baseClass.BaseClass;



public class OrangeHRM extends BaseClass {
	
	@Test
	 public void loginPageTest() {
		
	  WebElement imgElement=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
	  Assert.assertTrue(imgElement.isDisplayed());
	 }
	 
	 @Test
	 public void loginTest() {
		 
	  driver.findElement(By.id("txtUsername")).sendKeys("admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	        String actualTitle=driver.getTitle();
	        String expectedTitle="OrangeHRM";
	        Assert.assertEquals(actualTitle, expectedTitle);
	 }
	 
	 @Test
	 public void sampleCase() {
      ExtentMangerClass.extentTest.createNode("Validation1");
	  Assert.assertTrue(true);
	  ExtentMangerClass.extentTest.createNode("Validation2");
	  Assert.assertTrue(true);
	  ExtentMangerClass.extentTest.createNode("Validation3");
	  Assert.assertTrue(true);
	  ExtentMangerClass.extentTest.createNode("Validation4");
	  Assert.assertTrue(true);
	 }

}
