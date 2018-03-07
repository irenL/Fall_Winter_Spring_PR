package com.prestashop.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopularItemsHomePage {

	private WebDriver driver;

	public PopularItemsHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// //ul[@id='homefeatured']/li//div[@class='right-block']//span[@class='price product-price']
	@FindBy(xpath="//ul[@id='homefeatured']/li/div/div[2]/div[@class='content_price']/span[@class='price product-price']")
	public List<WebElement> popularItems;
	
	@FindBy(xpath="//ul//li/div/div/div/span[@class='price product-price']")
	public List<WebElement> popularItemsMore;
	
}
