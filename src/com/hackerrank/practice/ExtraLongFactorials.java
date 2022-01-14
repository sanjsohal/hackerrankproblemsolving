package com.hackerrank.practice;

import java.math.BigInteger;

public class ExtraLongFactorials {
	public static void extraLongFactorials(int n) {
		BigInteger multiply = new BigInteger("1");
		for(int i = n;i>=1;i--) {
			String s = String.valueOf(i);
			BigInteger temp = new BigInteger(s);
			multiply = multiply.multiply(temp);
		}
		System.out.println(multiply);
	}
	public static void main(String...args) {
		extraLongFactorials(25);
	}
}
