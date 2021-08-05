package com.crm.vtiger.OrganisationPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {
	public OrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Identification and Initialization of webelements
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrganisationImg;

	//Getters methods
	public WebElement getCreateOrganisationImg() {
		return createOrganisationImg;
	}

	//Business logics written here.
	public void clickOnCreateOrganisationImg () {
		createOrganisationImg.click();
	}
}
