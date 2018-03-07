package com.prestashop.tests.registration;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.prestashop.pages.AccountPage;
import com.prestashop.pages.HomePage;
import com.prestashop.pages.LoginPage;

import com.prestashop.utils.Configurations;
import com.prestashop.utils.TestBaseClass;

public class LoginTests extends TestBaseClass{

	
	
	
	@Test (groups="smoke",enabled = false)
	public void positiveLoginTest() {

		// create oject frome Page Class
		HomePage homePage = new HomePage(driver);

		// verify at page
		assertTrue(homePage.isAt());

		// verify logo is displayed
		assertTrue(homePage.logo.isDisplayed());

		homePage.gotoLoginPage();

		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isAt());

		assertTrue(loginPage.createAccountLabel.isDisplayed());
		assertTrue(loginPage.alreadyRegisteredLabel.isDisplayed());
		
		// Eneter valid email and password then click sign in
//		loginPage.emailAddressField.sendKeys(Configuration.getProperty("email"));
//		loginPage.passwordField.sendKeys(Configuration.getProperty("password"));
//		loginPage.SubmitLogin.click();
//		
		loginPage.login(Configurations.getProperty("email"),Configurations.getProperty("password"));
		
		AccountPage accountPage = new AccountPage(driver);
		
		assertTrue(accountPage.isAt(), "Not a Same Page");
		
		assertTrue(accountPage.verifyUserOptions("ORDER HISTORY AND DETAILS", 
				                                  "MY CREDIT SLIPS",
				                                   "MY ADDRESSES",
			                               	"MY PERSONAL INFORMATION",
			                                       	"MY WISHLISTS"));
		
	}
	
}
