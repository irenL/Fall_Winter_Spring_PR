package com.amazonaws.tests;

import static org.testng.Assert.*;


import org.testng.annotations.Test;

import com.amazonaws.pages.AwsCalculatorPage;
import com.prestashop.utils.TestBaseClass;

public class AwsCalculatorTests extends TestBaseClass{

	AwsCalculatorPage awsPage = new AwsCalculatorPage();
	
	@Test(priority=0, description="Monthly bill should be $ 0.00 by default",  enabled=false)
	public void defualtMonthlyBillTest() throws InterruptedException {
		
		assertTrue(awsPage.isAt());
		
		Thread.sleep(1500);
	//	assertEquals(0.0 , awsCalculatorPage.getMonthlyBillAmount(), "Result not equals ");
		
		
		
	}
	
	@Test(priority=1)
	public void addedEc2DefaultValuesTest() {
		
		awsPage.addEc2.click();
		
		assertTrue(awsPage.descriptionBlank.getAttribute("value").isEmpty());
		
	    assertEquals(1,awsPage.getInstance());
		 
	}
	
	
}
