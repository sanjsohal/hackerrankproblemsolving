package com.hackerrank.practice;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
	public static void main(String...args) {
		System.out.println(divisibleSumPairs(6, 3, Arrays.asList(1,3,2,6,1,2)));
	}
	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int numberOfPairs = 0;
		for(int index = 0;index<ar.size();index++) {
			for(int j= index+1;j<ar.size();j++) {
				if((ar.get(index)+ar.get(j))%k==0) {
					numberOfPairs++;
				}
			}
		}
		return numberOfPairs;
	}
}
