package com.crm.vtiger.OrganisationPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class CreateNewOrganisationPage {
	
	public CreateNewOrganisationPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement oragnisationNameTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//select[@name='industry']")
	private WebElement industryDropDown;

	public WebElement getOragnisationNameTextField() {
		return oragnisationNameTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	//Business Logics Starts here.
	
	public void createOrganisation(String orgName) {
		oragnisationNameTextField.sendKeys(orgName);
		saveButton.click();
	}
	
	public void createOrganisationWithIndustryDropDown(String orgName, String industryType) {
	WebDriverUtility webdriverUtility = new WebDriverUtility();
		oragnisationNameTextField.sendKeys(orgName);
		webdriverUtility.SelectOption(industryDropDown, industryType);
		saveButton.click();
	}

}
