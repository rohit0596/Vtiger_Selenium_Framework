package com.crm.vtiger.ContactPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Identification and Initialization of webelements
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createContactLink;
	
	//Getters Method
	public WebElement getCreateContactLink() {
		return createContactLink;
	}
	
	//Business Logics
	public void clickOnCreateContactImg() {
		createContactLink.click();
	}
}
