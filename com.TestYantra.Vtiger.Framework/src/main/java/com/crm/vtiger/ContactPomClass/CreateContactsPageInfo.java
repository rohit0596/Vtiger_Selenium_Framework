package com.crm.vtiger.ContactPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactsPageInfo {
	public CreateContactsPageInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Identification and Initialization of Elements
	@FindBy(id = "mouseArea_Organization Name")
	private WebElement ContactOrganisationNameInfo;
	
	//Getters Method
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement ContactOrganisationNameTitleInfo;
	
	@FindBy(id = "mouseArea_Last Name")
	private WebElement lastNameInfo;

	public WebElement getContactOrganisationNameInfo() {
		return ContactOrganisationNameInfo;
	}

	public WebElement getContactOrganisationNameTitleInfo() {
		return ContactOrganisationNameTitleInfo;
	}
	
	//Business Logics
	public String getContactWithOrgaName() {
		return lastNameInfo.getText();
	}
	
}
