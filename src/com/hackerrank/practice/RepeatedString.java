package com.hackerrank.practice;

public class RepeatedString {
	public static void main(String...args) {
		System.out.println(repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400l));
	}
	
	public static long repeatedString(String s, long n) {
	    if(s.equals("a"))return Long.valueOf(n);
	    int lengthOfString = s.length();
	    int countOfAlphabet = 0;
	    if(lengthOfString>=n) {
	    	for(int i = 0;i<n;i++) {
	    		if(s.charAt(i)=='a') {
	    			countOfAlphabet++;
	    		}
	    	}
	    	return Long.valueOf(countOfAlphabet);
	    }
	    if(n>lengthOfString) {
	    	int countInOneString = 0;
	    	for(int i = 0;i<s.length();i++) {
	    		if(s.charAt(i)=='a') {
	    			countInOneString++;
	    		}
	    	}
	    	int remainedAfterDivision = (int) (n%lengthOfString);
	    	Long equallyDivided = Long.valueOf(n/lengthOfString);
	    	Long equalCounts = Long.valueOf(equallyDivided*countInOneString);
	    	String remainingString = s.substring(0,remainedAfterDivision);
	    	int remainingCounts = 0;
	    	for(int i = 0;i<remainingString.length();i++) {
	    		if(remainingString.charAt(i)=='a') {
	    			remainingCounts++;
	    		}
	    	}
	    	Long valueToReturn = equalCounts+remainingCounts;
	    	return valueToReturn;
	    }
		return 0;
	 }
}
