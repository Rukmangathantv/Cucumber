package com.testing.org;
import org.testng.annotations.*;

public class simpleannotations {
	@BeforeSuite
	private void setup() {
		System.out.println("Set up");
	}
	@BeforeTest
	private void browser() {
		System.out.println("open browser");
	}
	@BeforeClass
	private void url() {
		System.out.println("url");
	}
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	@Test
	private void searchmob() {
		System.out.println("search mob");
	}
	@Test
	private void searchdress() {
		System.out.println("search dress");
	}
	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}
	@AfterClass
	private void teardown() {
		System.out.println("browser close");
	}
	@AfterTest
	private void verify() {
		System.out.println("verification");
	}
	@AfterSuite
	private void clear() {
		System.out.println("cookies cleared");
	}
}

