package com.baseclass.com;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.test.pages.com.AssignLeave;
import com.test.pages.com.HomeDB;
import com.test.pages.com.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTest {

	 @Test(priority = 1)
public void TimesheetSubmit() throws Exception 
	{	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		BaseClassTest ob=new BaseClassTest();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPage obj=new LoginPage(driver);
		
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test.png");
		obj.loginModule("Admin", "admin123");
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test1.png");
		
		HomeDB obj2=new HomeDB(driver);
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test2.png");
		obj2.Verify_Dashboard();
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test3.png");
		
		obj2.VerifyTimesheet();
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test4.png");
		obj2.SelectProjectAndActivity("ACME Ltd - ACME Ltd", 5);
		
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test5.png");
		obj2.SaveAndSubmit();
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test6.png");
		
		Thread.sleep(5000);
	//	obj.Logout();
		
		// obj2.submitted();
				
	} 
	
	@Test(priority = 2)
	
	public void AssignLeaveTC2() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		BaseClassTest ob=new BaseClassTest();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPage obj=new LoginPage(driver);
		
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test7.png");
		obj.loginModule("Admin", "admin123");
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test8.png");
		AssignLeave obj4=new AssignLeave(driver);
		
		obj4.AssignLeave1();
		
		
	}
	
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file
                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
              //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
}

	
		


