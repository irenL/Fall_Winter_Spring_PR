package com.prestashop.tests.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import org.openqa.selenium.Keys;

import org.testng.annotations.Test;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.ProductPage;
import com.prestashop.pages.ResultPage;

import com.prestashop.utils.TestBaseClass;

public class SearchTest extends TestBaseClass{


		String searchQuery = "Printed Summer Dress";
		
	

		@Test (priority = 0, groups="smoke",enabled = false)
		public void searchTest() {
			HomePage homePage = new HomePage(driver);
			
			homePage.search_query_top.sendKeys(searchQuery + Keys.ENTER);
			
			ResultPage resultPage = new ResultPage(driver);
			
			assertTrue(resultPage.result(searchQuery).isDisplayed());
			}
		
		
		@Test  (priority = 1, groups= {"smoke", "regression"},enabled = false)
		public void productDetailsTest() {
			ResultPage resultPage = new ResultPage(driver);
			resultPage.result(searchQuery).click();
			ProductPage productPage = new ProductPage(driver);
			assertEquals(productPage.name.getText(), searchQuery);
		}
		
		

		@Test  (priority = 2,enabled = false)
		public void practiceTest() {
//			ResultPage resultPage = new ResultPage(driver);
//			resultPage.result(searchQuery).click();
//			ProductPage productPage = new ProductPage(driver);
//			assertEquals(productPage.name.getText(), searchQuery);
		}
	
}
