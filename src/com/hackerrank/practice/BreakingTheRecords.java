package com.hackerrank.practice;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
	public static void main(String...args) {
		System.out.println(breakingRecords(Arrays.asList(10,5,20,20,4,5,2,25,1)));
	}
	public static List<Integer> breakingRecords(List<Integer> scores){
		int highestScore = scores.get(0);
		int lowestScore = highestScore;
		int min = 0;
		int max = 0;
		for(int index = 1;index<scores.size();index++) {
			if(scores.get(index)>highestScore) {
				highestScore=scores.get(index);
				max++;
			} else if(scores.get(index)<lowestScore) {
				lowestScore = scores.get(index);
				min++;
			}
		}
		List<Integer> listToReturn = Arrays.asList(max,min);
		return listToReturn;
	}
}
