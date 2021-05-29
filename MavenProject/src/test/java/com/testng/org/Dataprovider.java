package com.testng.org;


	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class Dataprovider {
		@Test(dataProvider = "testdata")
		private void credential(String user, String pswrd)
		{
			System.out.println("username : "+user+ "password : "+pswrd);
		}
		@DataProvider
		private Object[][] testdata() 
		{
			return new Object[][]  
			{ 
				{"rukmangathan","ruk123"},{"vignesh","vignesh123"},{"tington","tington123"}
			};
		}

	}


