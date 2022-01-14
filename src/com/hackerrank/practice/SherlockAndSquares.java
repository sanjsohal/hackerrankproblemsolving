package com.hackerrank.practice;

public class SherlockAndSquares {
	public static void main(String...args) {
		long t1 = System.currentTimeMillis();
		int count = squares(154654533, 791652309);
		long t2 = System.currentTimeMillis();
		System.out.println("Time taken=======>"+(t2-t1));
		System.out.println(count);
	}
	public static int squares(int a, int b) {
		int countOfSquares = 0;
		int startNumber = 0;
		int endNumber = 0;
		for(int i = a;i<=b;i++) {
			double d = Math.sqrt(i);
			if(d%1==0) {
				startNumber = (int)d;
				break;
			}
		}
		for(int j = b;j>=a;j--) {
			double d = Math.sqrt(j);
			if(d%1==0) {
				endNumber = (int)d;
				break;
			}
		}
		if((endNumber == startNumber)&& (endNumber!=0 && startNumber!=0)) {
			return 1;
		}
		int difference = endNumber-startNumber;
		if(difference>0)
		countOfSquares = difference+1;
		return countOfSquares;
	}
}
