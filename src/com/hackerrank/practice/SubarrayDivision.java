package com.hackerrank.practice;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
	public static void main(String...args) {
		System.out.println(birthday(Arrays.asList(2,2,1,3,2),4,2));
	}
	public static int birthday(List<Integer> s,int d, int m) {
		int numberOfWays = 0;
		for(int index = 0;index<s.size();index++) {
			int sum = 0;
			for(int j=index;j<index+m && j<s.size();j++) {
				sum+=s.get(j);				
			}
			if(sum == d) {
				numberOfWays++;
			}
		}
		return numberOfWays;
	}
}
