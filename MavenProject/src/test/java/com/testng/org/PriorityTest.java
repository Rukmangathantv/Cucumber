package com.testng.org;

import org.testng.annotations.Test;

public class PriorityTest {
	 @Test(priority = -1)
	   private void searchmob() {
		   System.out.println("Search Mobile");
	}
	   @Test(priority = 4)
	  private void searchlaptop() {  
		   System.out.println("Search Laptop");
	  }
@Test
private void login() {
	System.out.println("Login");
	
	}
@Test(priority = 0)
private void url(){
System.out.println("URL");	
}
}
