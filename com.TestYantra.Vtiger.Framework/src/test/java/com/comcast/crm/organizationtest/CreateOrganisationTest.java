package com.comcast.crm.organizationtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.HomepagePomclass.HomePage;
import com.crm.vtiger.OrganisationPomClass.CreateNewOrganisationPage;
import com.crm.vtiger.OrganisationPomClass.CreateOrganizationInfoPage;
import com.crm.vtiger.OrganisationPomClass.OrganisationPage;

public class CreateOrganisationTest extends BaseClass {

	@Test
	public void createOrganisation() throws Throwable {
		//Get Excel Data
		String expectedOrgName = eUtil.getExcelData("org", 1, 2)+JavaUtility.getRandomData();

		//Click on Organization link on Home Page.
		HomePage homePage = new HomePage(driver);
		homePage.clickOnOrganisationImg();

		//Click on create Organization Page
		OrganisationPage createOrganisationPage = new OrganisationPage(driver);
		createOrganisationPage.clickOnCreateOrganisationImg();

		//Create Organization
		CreateNewOrganisationPage createNewOrganisation = new CreateNewOrganisationPage(driver);
		createNewOrganisation.createOrganisation(expectedOrgName);
		
		//Get organization Name
		CreateOrganizationInfoPage createOrganisationInfo = new CreateOrganizationInfoPage(driver);
		String actualOrganisationName = createOrganisationInfo.getOrganisation();
		
		//Validation
		Assert.assertEquals(actualOrganisationName, expectedOrgName);





	}

}
