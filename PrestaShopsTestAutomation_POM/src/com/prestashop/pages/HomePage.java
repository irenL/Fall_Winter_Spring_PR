package com.prestashop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Sign in")
	public WebElement signInLink;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	public WebElement logo;

	// will find by id = search_query_top
	public WebElement search_query_top;
	
	public boolean isAt() {
		return driver.getTitle().equals("My Store");
	}
	
	public void gotoLoginPage() {
		signInLink.click();
	}
	
	@Test
	public WebElement listing(String product) {
		return driver.findElement(By.cssSelector("a.product-name[title='"+product+"']"));
	}
	//==========================================================================
	
	@FindBy(xpath="//div[@class='nav-dropdown']//*[.='Profiles']")
	public WebElement profiles;
	
	@FindBy(xpath="//ul[@class='nav-children__list']//a[.='Agencies']")
	public WebElement agencies;
	
	
}
