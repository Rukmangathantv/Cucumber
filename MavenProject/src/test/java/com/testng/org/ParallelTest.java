package com.testng.org;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class ParallelTest {

		@Test
		private void amazon() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
			WebDriver dr = new ChromeDriver();
			dr.get("http://www.flipkart.com");
		}
		@Test
		private void myntra() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
			WebDriver dr = new ChromeDriver();
			dr.get("http://www.google.com");
		}
		@Test
		private void ajio() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
			WebDriver dr = new ChromeDriver();
			dr.get("http://www.ajio.com");
		}
		
	}


