package com.crm.vtiger.OrganisationPomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class OrganisationPage {
	public OrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Identification and Initialization of webelements
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrganisationImg;
	
	@FindBy(xpath="//table[@class='lvt small']/tbody/tr[*]/td[1]")
	private List<WebElement> organisationCheckBoxes;
	
	@FindBy(xpath="//table[@class='lvt small']/tbody/tr[3]/td[8]/a[.='del']")
	private WebElement deleteOraganizationButton;

	//Getters methods
	public WebElement getCreateOrganisationImg() {
		return createOrganisationImg;
	}

	//Business logics written here.
	public void clickOnCreateOrganisationImg () {
		createOrganisationImg.click();
	}
	
	public void selectAllOrganisationOneByOne() {
		List<WebElement> allCheckBoxes = organisationCheckBoxes;
		
		for (int i = 2; i < allCheckBoxes.size(); i++ ) {
			
			allCheckBoxes.get(i).click();
		}
	}
	
	public void selectLastOrganisation() {
		List<WebElement> allCheckBoxes = organisationCheckBoxes;
		allCheckBoxes.get(allCheckBoxes.size()-1).click();
	}
	
	public void deleteOrganisation(WebDriver driver) {
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		deleteOraganizationButton.click();
		webDriverUtility.acceptAlert(driver);
		
	}
	
	
}
