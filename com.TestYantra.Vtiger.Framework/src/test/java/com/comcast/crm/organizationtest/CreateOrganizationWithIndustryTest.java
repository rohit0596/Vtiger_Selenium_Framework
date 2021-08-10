package com.comcast.crm.organizationtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.HomepagePomclass.HomePage;
import com.crm.vtiger.OrganisationPomClass.CreateNewOrganisationPage;
import com.crm.vtiger.OrganisationPomClass.CreateOrganizationInfoPage;
import com.crm.vtiger.OrganisationPomClass.OrganisationPage;

public class CreateOrganizationWithIndustryTest extends BaseClass {

	@Test
	public void createOrganizationWithIndustryTest() throws Throwable {

		//Get Excel Data
		String expectedOrgName = eUtil.getExcelData("org", 1, 2)+JavaUtility.getRandomData();
		String expectedIndustryName = eUtil.getExcelData("org", 4, 3);
		//Click on Organization link on Home Page.
		HomePage homePage = new HomePage(driver);
		homePage.clickOnOrganisationImg();

		//Click on create Organization Page
		OrganisationPage createOrganisationPage = new OrganisationPage(driver);
		createOrganisationPage.clickOnCreateOrganisationImg();

		//Create Organization with Industry Name
		CreateNewOrganisationPage createNewOrganisation = new CreateNewOrganisationPage(driver);
		createNewOrganisation.createOrganisationWithIndustryDropDown(expectedOrgName, expectedIndustryName);

		//Get organization Name and Industry Name.
		CreateOrganizationInfoPage createOrganisationInfo = new CreateOrganizationInfoPage(driver);
		String actualOrganisationName = createOrganisationInfo.getOrganisationName();
		String actualIndustryName = createOrganisationInfo.getIndustryName();

		//Validation
		Assert.assertEquals(actualOrganisationName, expectedOrgName);
		Assert.assertEquals(actualIndustryName, expectedIndustryName);

	}
}
