package com.mainpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetails {
	
	WebDriver driver;
	By contactDetail=By.linkText("Contact Details");
	By editBtn=By.cssSelector("input#btnSave");
	By address1=By.cssSelector("input#contact_street1");
	By cityName=By.xpath("//input[@name='contact[city]']");
	By mobileNumber=By.xpath("//input[@name='contact[emp_mobile]']");
	By mailId=By.xpath("//label[text()='Work Email']//following-sibling::input[1]");
	By saveBtn =By.xpath("//input[@tabindex='2']");
	
	



	public ContactDetails(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		
	}





	public void ContractInfo() {
		driver.findElement(contactDetail).click();
		driver.findElement(editBtn).click();
		driver.findElement(address1).sendKeys("Heaven,goddess,#1111");
		driver.findElement(cityName).sendKeys("cloudy");
		driver.findElement(mobileNumber).sendKeys("9823458723");
		driver.findElement(mailId).sendKeys("paul1@osohrm.com");
		driver.findElement(saveBtn).click();
	}
	


}
