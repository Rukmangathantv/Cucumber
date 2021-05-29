package com.testing.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retrysample {

	@Test(retryAnalyzer = retryanalyzier.class)
	private void test() {
		
		Assert.assertEquals("miru", "Miru");
	}
}
