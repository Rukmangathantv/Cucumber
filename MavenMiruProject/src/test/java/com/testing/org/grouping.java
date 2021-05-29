package com.testing.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class grouping {
	@Test(groups = "dress shopping")
	private void myntra() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.myntra.com");
	}
	@Test(groups = "dress shopping")
	private void ajio() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.ajio.com");
	}
	@Test(groups = "online shopping")
	private void amazon() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.amazon.com");
	}
	@Test(groups = "online shopping")
	private void flipkart() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.flipkart.com");
	}
	@Test(groups = "cosmatics shopping")
	private void purple() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.purple.com");
	}
	@Test(groups = "cosmatics shopping")
	private void nykaa() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.nykaa.com");
	}
}
