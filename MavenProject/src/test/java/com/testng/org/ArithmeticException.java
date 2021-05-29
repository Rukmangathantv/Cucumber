package com.testng.org;

import org.testng.annotations.Test;

public class ArithmeticException {
	@Test
	private void add() {
	int i = 4;
	int j = 6;
	int k = i+j;
	System.out.println(k);
	}
   @Test(expectedExceptions = ArithmeticException.class)
   private void divide(){
int i =10;
int j =0;
int k =i/j;
System.out.println(k);
}
}

