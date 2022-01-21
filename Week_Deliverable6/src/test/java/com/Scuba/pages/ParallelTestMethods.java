package com.Scuba.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.scuba.helper.ExtentReporterManager;
import com.scuba.helper.WebUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestMethods {
	
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
	
	
	
	@BeforeMethod
	public void setUp() {
		extent = ExtentReporterManager.getReports();
	}

	@Test
	@Parameters({ "browser", "testname" })
	public void Test1(String browser, String testname) throws IOException, InterruptedException {
		test = extent.createTest(testname);
		test.log(Status.INFO, "Starting execution of chrome test case");
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		System.out.println("Execution Method Test1 from Parallel Tests Class");
       WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepikab\\eclipse-workspace\\Activity6\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		test.log(Status.INFO, "Started the browser");
		WebUtils.takeSnapshot(driver, "target/screenshots/test1.png"); 
		Thread.sleep(10000);
        driver.close();	
	}
	
	@Test
	@Parameters({ "browser", "testname" })
	public void Test2(String browser, String testname) throws IOException, InterruptedException {
		test = extent.createTest(testname);
		test.log(Status.INFO, "Starting execution of chrome test case");
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		System.out.println("Execution Method Test2 from Parallel Tests Class");
	 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		test.log(Status.INFO, "Started the browser");
		Thread.sleep(10000);
		WebUtils.takeSnapshot(driver, "target/screenshots/test1.png"); 		
        driver.close();		
	}
	
	@Test
	@Parameters({ "browser", "testname" })
	public void Test3(String browser, String testname) throws IOException, InterruptedException {
		test = extent.createTest(testname);
		test.log(Status.INFO, "Starting execution of chrome test case");
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		System.out.println("Execution Method Test3 from Parallel Tests Class");
		 WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		test.log(Status.INFO, "Started the browser");
		WebUtils.takeSnapshot(driver, "target/screenshots/test1.png"); 	
		Thread.sleep(10000);
        driver.close();	
	}

	@AfterMethod
	public void tearDown() {
		extent.flush(); 
	}



	
	

}
