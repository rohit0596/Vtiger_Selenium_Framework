package com.crm.vtiger.OrganisationPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationInfoPage {

	public CreateOrganizationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@id='dtlview_Organization Name']")
	private WebElement organizationNameInfo;
	
	@FindBy(xpath = "//span[@id='dtlview_Industry']")
	private WebElement industryNameInfo;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement pageTitleInfo;

	public WebElement getOrganizationNameIfo() {
		return organizationNameInfo;
	}

	public WebElement getOrganisationTitleName() {
		return pageTitleInfo;
	}
	
	//Business Logics Starts here
	public String getOrganisationName() {
		return organizationNameInfo.getText();
	}
	
	public String getIndustryName() {
		return industryNameInfo.getText();
	}
//	public String getOrganisationFromTitle() {
//		return pageTitleInfo.
//	}
}
