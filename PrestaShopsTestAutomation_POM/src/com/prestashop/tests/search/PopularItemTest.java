package com.prestashop.tests.search;

import java.util.List;

import java.util.function.Predicate;


import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import com.prestashop.pages.PopularItemsHomePage;
import com.prestashop.utils.TestBaseClass;

public class PopularItemTest extends TestBaseClass{


	
	@Test (priority = 0,enabled = false)
	public void popularItemTest() {

		PopularItemsHomePage popularItemPage = new PopularItemsHomePage(driver);
		
		List<WebElement> pricesOfPopular = popularItemPage.popularItems;  // size == 7

		List<WebElement> pricesOfPopularMore = popularItemPage.popularItemsMore; // we have to get reed of some elements
		
		// Begin Correct list of webElements
		System.out.println(pricesOfPopular.size());
		
		for (int i = 0; i < pricesOfPopular.size(); i++) {
			String priceEach = pricesOfPopular.get(i).getText();
			System.out.println(priceEach);
		}
		// End Correct list of webElements
		
		// get price is > 30 
		for (int i = 0; i < pricesOfPopular.size(); i++) {
			String priceEach = pricesOfPopular.get(i).getText(); 
			double priceAsNumber = Double.parseDouble(priceEach.substring(1));
			if(priceAsNumber > 30)
				System.out.println(priceAsNumber);
		}
		
		
		
		// Begin UnCorrect list of webElements
		
		System.out.println(pricesOfPopularMore.size());

		for (int i = 0; i < pricesOfPopularMore.size(); i++) {
			String priceEach = pricesOfPopularMore.get(i).getText();

			if (priceEach.length() != 0) {
				System.out.println(priceEach);
			}
		}
		System.out.println("====");
		// End UnCorrect list of webElements
		
		// this Predicate is not working !!!!!!!!
		Predicate<WebElement> emptyElementRemover1 = t -> t.getText().length()!=0;

		System.out.println(pricesOfPopularMore.removeIf(emptyElementRemover1));
		
		System.out.println("new list size after removeIf " + pricesOfPopularMore.size() );
	}

	
}
