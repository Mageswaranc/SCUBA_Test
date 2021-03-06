package com.mainpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalDetails {
	WebDriver driver;
	By infoTab=By.xpath("//b[contains(text(),'My Info')]");
	By editOption=By.cssSelector("input#btnSave");
	By employeeID=By.cssSelector("input#personal_txtEmployeeId");
	By driverLicence=By.cssSelector("input#personal_txtLicenNo");
	By ssnNumber=By.cssSelector("input#personal_txtNICNo");
	By nickName=By.id("personal_txtEmpNickName");
	//By nickName=By.cssSelector("input#personal_txtEmpNickName");
	By save=By.xpath("//input[@id='btnSave']");

	public PersonalDetails(WebDriver driver)
	{
		this.driver=driver;
	}

	public void PerfonalInfoEdit() throws InterruptedException {

		driver.findElement(infoTab).click();
		driver.findElement(editOption).click();
		
		driver.findElement(editOption).clear();
		driver.findElement(employeeID).sendKeys("12345");
		Thread.sleep(4000);


		driver.findElement(driverLicence).clear();
		driver.findElement(driverLicence).sendKeys("M605");
		
		driver.findElement(ssnNumber).clear();
		driver.findElement(ssnNumber).sendKeys("46565");
		
		driver.findElement(nickName).clear();
		driver.findElement(nickName).sendKeys("MAGESWARAN");
		
		driver.findElement(save);
		Thread.sleep(3000);

	}

}


