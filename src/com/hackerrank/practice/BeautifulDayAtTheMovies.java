package com.hackerrank.practice;

public class BeautifulDayAtTheMovies {
	public static void main(String...args) {
		System.out.println(beautifulDays(20, 23, 6));
	}
	public static int beautifulDays(int i, int j, int k) {
			int numberOfBeautifulDays = 0;
	    	for(int temp=i;temp<=j;temp++) {
	    		int number = temp;
	    		int rev = 0;
	    		while(number!=0) {
	    			int remainder = number%10;
	    			rev = rev*10+remainder;
	    			number = number/10;
	    		}
	    		int result=0;
	    		if(rev>temp) {
	    			result = rev-temp;
	    		} else {
	    			result = temp-rev;
	    		}
	    		if(result%k==0)numberOfBeautifulDays++;
	    	}
			return numberOfBeautifulDays;
	    }
	
}
