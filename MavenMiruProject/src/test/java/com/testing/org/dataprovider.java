package com.testing.org;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
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
			{"miru","miru123"},{"tharu","tharu123"},{"chintu","chintu123"}
		};
	}

}
