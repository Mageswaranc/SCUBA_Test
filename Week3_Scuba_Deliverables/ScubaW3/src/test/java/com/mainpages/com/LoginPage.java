package com.mainpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	WebDriver driver;
	By Username=By.id("txtUsername");
	By Password=By.name("txtPassword");
	By LoginButton=By.xpath("//input[@name='Submit']");
	By ForgotPassword=By.xpath("//a[contains(text(),'Forgot your password?')]");


	


	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}


	public void loginModule(String userid, String pass) {
		// TODO Auto-generated method stub
		driver.findElement(Username).sendKeys(userid);
		driver.findElement(Password).sendKeys(pass);
		driver.findElement(LoginButton).click();
		
	}
}

