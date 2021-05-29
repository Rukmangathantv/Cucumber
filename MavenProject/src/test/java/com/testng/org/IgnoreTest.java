package com.testng.org;

	import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

	public class IgnoreTest {
	@Test
	private void BrowserLaunch(){
		System.out.println(" Browser Launch");
	}
	@Test
	@Ignore
	private void login(){
		System.out.println("Login");
	}
	@Test
	private void searchmob() {
		System.out.println("Search Mobile");
	}

	}


