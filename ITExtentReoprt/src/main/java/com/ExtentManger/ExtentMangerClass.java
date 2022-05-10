package com.ExtentManger;



import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.baseClass.BaseClass;

public class ExtentMangerClass {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extentReport;
	public static ExtentTest extentTest;
	public static WebDriver driver;
	
	
	
	public  static void setExtent()
	{
		htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+BaseClass.getCurrentTime()+"MyReport.html/");
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml"); 
		  
		
		/*htmlReporter.config().setDocumentTitle("Automation Testing Report");
		htmlReporter.config().setReportName("Orange HRM Test Automation Report");
		htmlReporter.config().setTheme(Theme.STANDARD);*/
		
		extentReport=new ExtentReports();
		extentReport.attachReporter(htmlReporter);
		
		extentReport.setSystemInfo("HostName","My Host");
		extentReport.setSystemInfo("ProjectName", "Orange HRM");
		extentReport.setSystemInfo("Tester", "Durga Prasad");
		extentReport.setSystemInfo("OS","Window10");
		extentReport.setSystemInfo("Browser","Chrome");
		
	}
	
	public static void endReport()
	{
		extentReport.flush();
	}
	
	

}
