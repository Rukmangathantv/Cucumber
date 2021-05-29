package com.testng.org;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class simpleAnnotation {
	@BeforeSuite
	private void setup() {
		System.out.println("SET UP");		
	}
	@BeforeTest
	private void BrowswerLaunch() {
	System.out.println("Browser Launch");
	}
	@BeforeClass
	private void url() {
		System.out.println("Url");
	}
	@BeforeMethod
	private void login() {
		System.out.println("Login ");
	}
   @Test
   private void searchmob() {
	   System.out.println("Search Mobile");
}
   @Test
  private void searchlaptop() {  
	   System.out.println("Search Laptop");
  }
   @AfterMethod
   private void logout() {
	   System.out.println("Logout");
   }
   @AfterClass
   private void browserclose(){
	   System.out.println("Browser Close");
   }
   @AfterTest
   private void verification() {
	   System.out.println("Verification");
   }
   @AfterSuite
   private void cookies(){
   System.out.println("Delete cookies");
   }
}

