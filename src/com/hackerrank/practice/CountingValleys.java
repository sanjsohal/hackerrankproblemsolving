package com.hackerrank.practice;

public class CountingValleys {
	public static void main(String...args) {
		System.out.println(countingValleys(8,"UDDDUDUU"));
	}
	public static int countingValleys(int steps, String path) {		
		int numberOfValleysTraversed = 0;		
		int numberOfMountains = 0;
		int numberOfValleys = 0;
		for(int index = 0;index<path.length();index++) {			
			if(path.charAt(index)=='U') {
				numberOfMountains++;
				if(numberOfValleys>=numberOfMountains) {
					if((numberOfValleys-numberOfMountains)==0) {
						numberOfValleysTraversed++;
						numberOfValleys =0;
						numberOfMountains=0;
					}
					
				}
				if(numberOfMountains>=numberOfValleys) {
					if((numberOfMountains-numberOfValleys)==0) {
						numberOfMountains = 0;
						numberOfValleys = 0;
					}
				}
			}
			if(path.charAt(index)=='D') {
				numberOfValleys++;				
			}
			
		}
		return numberOfValleysTraversed;
	} 
}
