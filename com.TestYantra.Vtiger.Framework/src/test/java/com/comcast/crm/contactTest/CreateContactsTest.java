package com.comcast.crm.contactTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.vtiger.ContactPomClass.ContactsPage;
import com.crm.vtiger.ContactPomClass.CreateContactsPageInfo;
import com.crm.vtiger.ContactPomClass.CreateNewContactPage;
import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.HomepagePomclass.HomePage;

public class CreateContactsTest extends BaseClass{
	
	@Test
	public void createContactsTest() throws Throwable {

		String expectData = eUtil.getExcelData("contact", 1, 2);

		//Click on Contact Link
		HomePage homePage = new HomePage(driver);
		homePage.clickOnContactLink();

		//Click on Create Contact Link
		ContactsPage contactPage = new ContactsPage(driver);
		contactPage.clickOnCreateContactImg();

		//Create Contact
		CreateNewContactPage createNewContactPage = new CreateNewContactPage(driver);
		createNewContactPage.createOrganisation(driver, expectData);

		//Get ContactData including Organization Name
		CreateContactsPageInfo createContactPageInfo = new CreateContactsPageInfo(driver);
		String actualData = createContactPageInfo.getContactWithOrgaName();
		boolean flag = false;
		System.out.println(expectData);
		System.out.println(actualData);
		if (actualData.contains(expectData)) {
			flag=true;
		}
		//Validation
		Assert.assertEquals(flag, true);
	
	}


}
