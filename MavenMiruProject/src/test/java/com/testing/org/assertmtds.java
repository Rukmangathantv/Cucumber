package com.testing.org;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertmtds {

	String actual ="VIGNESH";
	String expected ="vignesh";
	@Test
	private void hardassert() {
		
		Assert.assertNotEquals(actual, expected);
	}
	@Test
	private void softassert() {
		
		SoftAssert sa = new SoftAssert();
		sa.assertNotEquals(actual, expected);
	}
}
