package com.prestashop.tests.contactus;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.prestashop.pages.PhoneNumberHomePage;

import com.prestashop.utils.StringUtil;
import com.prestashop.utils.TestBaseClass;

public class PhoneNumberTests extends TestBaseClass{

	
	String expectedCallUsNowPhone = "Call us now: 0123-456-789";
	String actualNumber = "0123456789";
	
	
	@Test (priority = 0,enabled = false)
	public void callUsNowPhoneTest() {

		PhoneNumberHomePage phonePage = new PhoneNumberHomePage(driver);

		// checks if Call us now: 0123-456-789 is displayed
		assertTrue(phonePage.callPhone.isDisplayed());
		assertTrue(actualNumber.equals(StringUtil.extractNumberfromString(phonePage.callPhone.getText()))," expected number not equals actual number");
		
//		// begin team test
//		String number = phonePage.callPhone.getText();
//		StringBuilder expectedNumber = new StringBuilder();
//		for (int i = 0; i < number.length(); i++) {
//			if (Character.isDigit(number.charAt(i))) {
//				expectedNumber.append(number.charAt(i));
//			}
//		}
//		String actualNumber = StringUtil.extractNumberfromString(number);
//		assertTrue(actualNumber.equals(expectedNumber));
//		// end team test
		
		
	}
	
}
