package com.prestashop.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


// WebDriver factory takes string as an input and return the implementation of the webdriver based on that 

public class Driver {

	private static WebDriver driver;

	public static WebDriver getDriver(String browser) {

		String driverType = browser == null ? Configurations.getProperty("browser") : browser;

		// if browser has value, use browser
		// else use the value from the configuration file

		if (driver == null) {

			// create webdriver based on the value of browser parameter

			switch (driverType.toLowerCase()) {

			case "chrome":
				System.setProperty(Configurations.getProperty("mydriverchrome"),
						Configurations.getProperty("chromedriverpath"));
				driver = new ChromeDriver();
				break;

			case "gecko":
				System.setProperty(Configurations.getProperty("mydrivergecko"),
						Configurations.getProperty("geckodriverpath"));
				driver = new FirefoxDriver();
				break;

			case "safari":
				break;

			case "edge":
				break;
			default:
				break;
			}

		}
		return driver;
	}

	public static void quit() { // this quit() will kill the object

		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
