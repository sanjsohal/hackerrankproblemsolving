package com.hackerrank.practice;

import java.util.Arrays;
import java.util.List;

public class TheHurdleRace {
	public static void main(String...args) {
		System.out.println(hurdleRace(7,Arrays.asList(2,5,4,5,2)));
	}
	public static int hurdleRace(int k, List<Integer> height) {
	    	int highestDose = 0;
	    	for(int index = 0;index<height.size();index++) {
	    		if(k<height.get(index)) {
	    			int difference =height.get(index)-k;
	    			if(difference>highestDose) {
	    				highestDose = difference;
	    			}
	    		}
	    	}
			return highestDose;
	   }
}
