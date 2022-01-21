package com.Scuba.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowser {

	public WebDriver driver;

  @Parameters("browser")
  @Test
  public void login(String browser) {
	  if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\deepikab\\eclipse-workspace\\Activity6\\drivers\\geckodriver.exe");
		  WebDriver driver= new FirefoxDriver();	
		  driver.get("https://opensource-demo.orangehrmlive.com/");

	  }else if (browser.equalsIgnoreCase("chrome")) { 
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
	  }
	 

	}  

 public void afterTest() {

		driver.quit();

	}

}