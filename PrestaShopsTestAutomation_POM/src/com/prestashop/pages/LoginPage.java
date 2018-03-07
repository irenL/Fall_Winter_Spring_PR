package com.prestashop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//form[@id='create-account_form']//h3")
	public WebElement createAccountLabel;

	@FindBy(xpath = "//form[@id='login_form']/h3")
	public WebElement alreadyRegisteredLabel;

	@FindBy(id="email")     //xpath="//input[@id='email']"
	public WebElement emailAddressField;
	
	@FindBy(id="passwd")     //xpath="//input[@id='passwd']"
	public WebElement passwordField;
	
	// it will search the element by ID=SubmitLogin or NAME=SubmitLogin
	// @FindBy(id="SubmitLogin")   // //i[@class='icon-lock left']
	public WebElement SubmitLogin;
	
	
	public boolean isAt() {
		return driver.getTitle().equals("Login - My Store");
	}
	
	public void login(String loginEmail, String password) {
		emailAddressField.sendKeys(loginEmail);
		passwordField.sendKeys(password);
		SubmitLogin.click();
	}
	
	
	
	
	
	
}
