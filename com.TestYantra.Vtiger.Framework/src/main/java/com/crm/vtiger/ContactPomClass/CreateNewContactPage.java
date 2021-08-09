package com.crm.vtiger.ContactPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class CreateNewContactPage {

	public CreateNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Identification and Initialization of Elements
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement organizationNameImg;
	
	@FindBy(xpath = "//a[@id='1']")
	private WebElement organisationName;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	//Getters Method
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	
	public WebElement getOrganizationNameImg() {
		return organizationNameImg;
	}
	
	//Business Logics.
	public void createOrganisation(WebDriver driver,String lastName) {
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		lastNameTextField.sendKeys(lastName);
		organizationNameImg.click();
		webDriverUtility.switchToWindow(driver, "Accounts&action");
		organisationName.click();
		webDriverUtility.switchToWindow(driver, "Contacts");
		saveBtn.click();
		
	}
	
}
