package com.testng.org;

import org.testng.annotations.Test;

public class MultipleTimes {
	@Test(invocationCount = 4)
	private void setup() {
		System.out.println("SET UP");		
	}
	@Test
	private void BrowswerLaunch() {
	System.out.println("Browser Launch");
	}
	@Test
	private void url() {
		System.out.println("Url");
	}
	@Test
	private void login() {
		System.out.println("Login ");
	}
   @Test
   private void searchmob() {
	   System.out.println("Search Mobile");
}
   @Test(invocationCount =3 )
  private void searchlaptop() {  
	   System.out.println("Search Laptop");
  }
}
