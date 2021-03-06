package com.mainpages.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmergencyDetails {
	WebDriver driver;
	By emergencyContact =By.xpath("//a[@href=\"/index.php/pim/viewEmergencyContacts/empNumber/7\"]");
	By addBtn=By.xpath("//p[@id=\"listActions\"]//input[1]");
	By name=By.cssSelector("input.formInputText");
	By relationship=By.xpath("//input[@id='emgcontacts_relationship']");
	By  phoneNumber=By.xpath("//input[@name='emgcontacts[mobilePhone]']");
	By workTelephone=By.cssSelector("input#emgcontacts_workPhone");
	By BtnSave=By.cssSelector("input#btnSaveEContact");
	
	public EmergencyDetails(WebDriver driver) {
		this.driver=driver;
	}
	

	public void EmergencyContact() throws InterruptedException {
		driver.findElement(emergencyContact).click();
		Thread.sleep(3000);
		driver.findElement(addBtn).click();
		driver.findElement(name).sendKeys("Sita");
		driver.findElement(relationship).sendKeys("Mother");
		Thread.sleep(4000);
		driver.findElement(phoneNumber).sendKeys("8374637378");
		Thread.sleep(4000);
		driver.findElement(BtnSave);
		Thread.sleep(2000);
	}
	
}
