package com.testng.org;

import org.testng.annotations.Test;

public class Timeout {
	 @Test(timeOut = 3000)
	   private void searchmob() {
		   System.out.println("Search Mobile");
	}
	   @Test(timeOut = 3000)
	  private void searchlaptop() throws Throwable {  
		   Thread.sleep(5000);
		   System.out.println("Search Laptop");
	  }
}
