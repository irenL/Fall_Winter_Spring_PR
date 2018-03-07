package com.prestashop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ResultPage {

private WebDriver driver;
	
	public ResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@Test
	public WebElement result(String product) {
		return driver.findElement(By.cssSelector("a.product-name[title='"+product+"']"));
	}
	
	
}
