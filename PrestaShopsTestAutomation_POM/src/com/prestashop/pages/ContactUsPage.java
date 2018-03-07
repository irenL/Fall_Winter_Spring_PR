package com.prestashop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	private WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "contact-link")
	public WebElement contactUsLink;
	
	@FindBy(xpath = "//div[@id='uniform-fileUpload']/span[2]")
	public WebElement chooseFile;
	
	@FindBy(id="submitMessage")
	public WebElement buttonSend;
	
	@FindBy(xpath="//select[@id='id_contact']/option[2]")
	public WebElement subjectButton;
	
	@FindBy(id="email")
	public WebElement emailField;
	
	@FindBy(id="id_order")
	public WebElement orderReferenceField;
	
	
}
