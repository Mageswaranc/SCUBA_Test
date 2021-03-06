package com.sampletest.pak.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mainpages.com.ContactDetails;
import com.mainpages.com.EmergencyDetails;
import com.mainpages.com.LoginPage;
import com.mainpages.com.PersonalDetails;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	@Test
	
	public void Browser_Lanch() throws InterruptedException 
	{	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPage obj=new LoginPage(driver);
		obj.loginModule("Admin", "admin123");
		
		PersonalDetails obj2=new PersonalDetails(driver);
		obj2.PerfonalInfoEdit();
		
		ContactDetails obj3 = new ContactDetails(driver);
		obj3.ContractInfo();
		
		EmergencyDetails obj4 = new EmergencyDetails(driver);
		obj4.EmergencyContact();
		
		
	}
	
}
