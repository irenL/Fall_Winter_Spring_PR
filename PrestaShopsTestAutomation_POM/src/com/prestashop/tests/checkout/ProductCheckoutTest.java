package com.prestashop.tests.checkout;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.ProductPage;

import com.prestashop.utils.Configurations;
import com.prestashop.utils.TestBaseClass;

public class ProductCheckoutTest extends TestBaseClass {

	String productName = "Printed Summer Dress";

	@Test(priority = 0,enabled = false)
	public void productListing() {
		HomePage homePage = new HomePage(driver);
		homePage.listing(productName).click();
		ProductPage productPage = new ProductPage(driver);
		assertEquals(productPage.name.getText(), productName);
	}

	@Test(priority = 1, dependsOnMethods = "productListing",enabled = false)
	public void checkoutTest() {
		// Product successfully added to your shopping cart

		ProductPage productPage = new ProductPage(driver);
		productPage.addToCart.click();

		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(productPage.confirmation));

		assertTrue(productPage.confirmation.isDisplayed(), "Confirmation message was not displayed");
		String confirmation = "Product successfully added to your shopping cart";

		assertEquals(productPage.confirmation.getText().trim(), confirmation);
	}

}
