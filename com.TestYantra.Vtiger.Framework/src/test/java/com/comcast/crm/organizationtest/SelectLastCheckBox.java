package com.comcast.crm.organizationtest;

import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.HomepagePomclass.HomePage;
import com.crm.vtiger.OrganisationPomClass.OrganisationPage;

public class SelectLastCheckBox extends BaseClass {

	@Test
	public void selectLastCheckBox() {
		
		//Click on Organization link on Home Page.
		HomePage homepage = new HomePage(driver);
		homepage.clickOnOrganisationImg();

		//Click on create Organization Page
		OrganisationPage createOrganisationPage = new OrganisationPage(driver);
		createOrganisationPage.selectLastOrganisation();
	}
}
