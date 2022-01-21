package com.Scuba.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class ExampleGrid {
	
	public static String URL = "http://192.168.0.103:4444/";
	@Test
	public void testgrid() throws InterruptedException {
	DesiredCapabilities caps = new DesiredCapabilities();
	try {
		WebDriver driver;
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "chrome");
		//caps.setCapability("browser", "firefox");
		driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://www.rediff.com/");
		Thread.sleep(10000);
		driver.close();
		
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
	
	}
}
