package com.hackerrank.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result2 {


	public static int saveThePrisoner(int n, int m, int s) {
			int lowerLimit = 1;
			int higherLimit = 1000000000;
	    // Write your code here
			if(n>=lowerLimit && n<=higherLimit && m>=lowerLimit && m<=higherLimit
					&& s>=lowerLimit && s<=n) {
				if(s+m<=n) {
					return s+m-1;
				} else {
					int remainingCandies = m%n;
					if(remainingCandies == 0) {
						if(s ==1) return n; else return s-1;
					} else {
						if(remainingCandies+s>n) {
							if(remainingCandies+s-1-n==0) {return n;}
							return remainingCandies+s-1-n;
						} else {
					return remainingCandies+s-1;}}
				}
			}
			return 0;
			
			
			
	    }
}
	public class Solution2 {
    public static void main(String[] args) throws IOException {
		
		 long startTime = System.currentTimeMillis(); 
		 int result = Result2.saveThePrisoner(499999999,999999997,2);
		 long endTime = System.currentTimeMillis();
		 System.out.println("Time taken====>"+(endTime-startTime));
		 System.out.println(result);
		 
    	
    }
}
