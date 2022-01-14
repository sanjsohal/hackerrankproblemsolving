package com.hackerrank.practice;

public class FindDigits {
	public static void main(String...args) {
		System.out.println(findDigits(124));
	}
	public static int findDigits(int n) {
	    // Write your code here
		int numberOfDivisors = 0;
		int inputNumber = n;
		while(inputNumber!=0) {
			int remainder = inputNumber%10;
			if(remainder!=0 && n%remainder==0)numberOfDivisors++;
			inputNumber=inputNumber/10;
		}
		return numberOfDivisors;
	  }

}
