package com.hackerrank.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result {


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
					return remainingCandies+s-1;}
					}
				}
			}
			return 0;
			
			
			
	    }
}
	public class Solution {
    public static void main(String[] args) throws IOException {
		/*
		 * long startTime = System.currentTimeMillis(); int result =
		 * Result.saveThePrisoner(352926151, 380324688, 94730870); long endTime =
		 * System.currentTimeMillis();
		 * System.out.println("Time taken====>"+(endTime-startTime));
		 * System.out.println(result);
		 */
    	File file = new File("F:\\Hackerrank\\Test_Case_1.txt");
    	BufferedReader br
        = new BufferedReader(new FileReader(file));

    // Declaring a string variable
    String st;
    // Condition holds true till
    // there is character in a string
    List<String> values = new ArrayList<>();
    
    while ((st = br.readLine()) != null) {
    	values.add(st);}
    int wrongAnswers = 0;
    for(int index=0;index<values.size();index++) {
    	String str[]=values.get(index).split(",");
    	int value1 = Integer.parseInt(str[0].trim());
    	int value2 = Integer.parseInt(str[1].trim());
    	int value3 = Integer.parseInt(str[2].trim());
    	int expectedOutput = Integer.parseInt(str[3].trim());
    	long startTime = System.currentTimeMillis();
    	int result = Result.saveThePrisoner(value1, value2, value3);
    	long endTime =System.currentTimeMillis();
    	System.out.println("Time taken====>"+(endTime-startTime));
		if(expectedOutput!=result) {
			System.out.println("Algo wrong for index "+index);
			wrongAnswers++;
		}
    }
    System.out.println("Wrong answers===>"+wrongAnswers);
    }
}
