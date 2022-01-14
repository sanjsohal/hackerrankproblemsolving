package com.hackerrank.practice;

public class StrangeCounter {
	public static void main(String...args) {
		long startTime= System.currentTimeMillis();
		long result = strangeCounter(1000000000000000000l);
		System.out.println(result);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
	public static long strangeCounter(long t) {
		long startValue = 1l;
		long endValue = startValue*2+2;
		while(!(t>=startValue && t<endValue)) {
			startValue=endValue;
			endValue = startValue*2+2;
		}		
		long valueToSubtract= t-startValue;
		long valueToReturn = startValue+2-valueToSubtract;
		return valueToReturn;
	}
}
