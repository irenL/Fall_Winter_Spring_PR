package com.amazonaws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prestashop.utils.Driver;

public class AwsCalculatorPage {

	private WebDriver driver;

	public AwsCalculatorPage() {
		this.driver = Driver.getDriver(null);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className="billLabel")
	public WebElement  estMonthlyBillLink;
	
	
	@FindBy(xpath="//div[@class='body']//div[@class='Instances rowsSection']//tr[2]//img")
	public WebElement  addEc2;
	
	@FindBy(xpath="//div[@class='body']//div[@class='Instances rowsSection']//tr[2]/td[2]//input") 
	public WebElement descriptionBlank;
	
	@FindBy(xpath="//div[@class='body']//div[@class='Instances rowsSection']//tr[2]/td[3]//input") 
	public WebElement instance;
	
	
	//div[@class='body']//div[@class='Instances rowsSection']//tr[2]/td[3]//input
	public boolean isAt() {
		return driver.getTitle().equals("Amazon Web Services Simple Monthly Calculator");
	}
	
	public int getInstance() {
		return Integer.parseInt(instance.getAttribute("value"));
	}
	
	public double getMonthlyBillAmount() {
		
     return Double.parseDouble(estMonthlyBillLink.getText().split("$ ")[1].replace( ")",""));
	
	// LONGER WAY TO DO IT :  
//	 String billText = estMonthlyBillLink.getText();
//	 String[] arrBill = billText.split("$ ");
//	 String bill = arrBill[1].replace( ")" , "" );
//	 return Double.parseDouble(bill);
 	
	}
	
}
