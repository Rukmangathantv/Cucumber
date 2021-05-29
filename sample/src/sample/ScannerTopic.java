package sample;

import java.util.Scanner;

public class ScannerTopic {
	
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter a month name")	;
		String month = s.nextLine();
		System.out.println(month);
		System.out.println("days");
		int days =s.nextInt();
		System.out.println("days"+days);
		
		
	}

}
