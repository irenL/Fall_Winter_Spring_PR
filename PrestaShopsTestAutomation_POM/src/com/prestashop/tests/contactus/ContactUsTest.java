package com.prestashop.tests.contactus;


import org.testng.annotations.Test;

import com.prestashop.pages.ContactUsPage;


import com.prestashop.utils.TestBaseClass;

public class ContactUsTest extends TestBaseClass{


	@Test (priority = 0)
	public void contactUsTest() {
		ContactUsPage contactUsPage = new ContactUsPage(driver);
		contactUsPage.contactUsLink.click();
		
		String filePath = "/Users/imac/Desktop/file.txt";
	}
	
	
}
