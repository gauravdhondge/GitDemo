package org.rahulshettyacademy.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	
	ExtentReports extent;
	
	@BeforeTest
	public void Config() {
	
		
	 String path  = System.getProperty("user.dir")+"\\reports\\index.html";	
	ExtentSparkReporter reporter = new	ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation Results");
	reporter.config().setDocumentTitle("Test Results");
		
    extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester","Jayesh Dhondge");
		
		
		
	}
	
	@Test
	public void intialDemo() {
		
		
	ExtentTest test =	extent.createTest("initial Demo");
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
	//	test.fail("Result Do Not Match");
		
		extent.flush();
		
	}

}
