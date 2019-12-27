package com.rajesh;

import java.util.Scanner;

public class AdditionOfTwoIntegers {
	
	public void additionOfTwoIntegers(int firstInteger,int secondInteger) {
	
	int sum = firstInteger+secondInteger;
	System.out.println("Addition of "+firstInteger+ "and " + secondInteger+" is : "+sum);
		
	}
	public static void main(String[] args) {
	
	AdditionOfTwoIntegers addition = new AdditionOfTwoIntegers();
		
	Scanner inputScanner= new Scanner(System.in);
		
	 System.out.println("Enter First Integer: ");
     int a=inputScanner.nextInt();
     System.out.println("Enter Second Integer: ");
     int b=inputScanner.nextInt();
     addition.additionOfTwoIntegers(a, b);
     inputScanner.close();
     
	}

}
