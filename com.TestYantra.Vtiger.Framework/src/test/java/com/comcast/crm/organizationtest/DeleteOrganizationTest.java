package com.comcast.crm.organizationtest;

import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.HomepagePomclass.HomePage;
import com.crm.vtiger.OrganisationPomClass.OrganisationPage;

public class DeleteOrganizationTest extends BaseClass {

	@Test
	public void deleteOrganisation() {
		//Click on Organization link on Home Page.
		HomePage homepage = new HomePage(driver);
		homepage.clickOnOrganisationImg();

		//Click on create Organization Page and delete one organization
		OrganisationPage createOrganisationPage = new OrganisationPage(driver);
		createOrganisationPage.deleteOrganisation(driver);


	}
}
