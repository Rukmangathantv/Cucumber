package com.testing.org;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizedtest {

	@Test
	@Parameters({"user","pswrd"})
	private void credential(String user, String pswrd) {
		System.out.println("username : "+user+ "password : "+pswrd);
	}
}
