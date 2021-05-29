package com.testng.org;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Grouping {
		@Test(groups = "sports shopping")
		private void nike() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
			WebDriver dr = new ChromeDriver();
			dr.get("http://www.nike.com");
		}
		@Test(groups = "sports shopping")
		private void adidas() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
			WebDriver dr = new ChromeDriver();
			dr.get("http://www.adidas.com");
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
	}


