package com.prestashop.tests.search;



import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.prestashop.pages.HomePage;
import com.prestashop.utils.TestBaseClass;

public class TestSummary extends TestBaseClass {
	
	
	

	@Test
	public void productListing() throws InterruptedException {
//		driver.get("http://jscroll.com/");
//		Actions actions = new Actions(driver);
//		WebElement element = driver.findElement(By.xpath("//h2[.='About jScroll']"));
//		actions.moveToElement(element).click().sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
		
//		driver.get("file:///Users/imac/Desktop/USA_Spending.html");
//		Actions actions = new Actions(driver);
//		WebElement element = driver.findElement(By.xpath("//h1[@class='left']"));
//		Thread.sleep(1500);
//		actions.moveToElement(element).click().sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1500);
//
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1500);
//
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//
//		Thread.sleep(1500);
//
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//
//		Thread.sleep(1500);
	

	}
	
	@Test
	public void profiles() throws InterruptedException {
		
		Thread.sleep(1500);
		
		HomePage home = new HomePage(driver);
		
		Actions action = new Actions(driver);
		
		assertTrue(home.profiles.isDisplayed(), " element not exist");
		Thread.sleep(1500);
	
		action.moveToElement(home.profiles).perform();
		action.moveToElement(home.agencies).click().perform();
	
	

		
		
		//AUT Url:  https://calculator.s3.amazonaws.com/index.html
	}
	
}
