package com.testing.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paralleltest {

	@Test
	private void amazon() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.amazon.com");
	}
	@Test
	private void myntra() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.myntra.com");
	}
	@Test
	private void ajio() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.ajio.com");
	}
	
}
