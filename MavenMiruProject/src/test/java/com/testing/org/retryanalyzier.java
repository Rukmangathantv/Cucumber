package com.testing.org;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryanalyzier implements IRetryAnalyzer {
	
	int c=0;
	int l=4;
	@Override
	public boolean retry(ITestResult result) {
		if(c<l)
		{	c++;
			return true;
		}
		return false;
	}

}
