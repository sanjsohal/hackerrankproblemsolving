package com.hackerrank.practice;

import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {
	public static void main(String...args) {
		List<Integer> input = Arrays.asList(0,1,0,0,0,1,0);
		System.out.println(jumpingOnClouds(input));
	}
	public static int jumpingOnClouds(List<Integer> c) {
		int numberOfJumps = 0;
		int startIndex = 0;
		int sizeOfList = c.size();
		while(startIndex<sizeOfList-1) {
			if(startIndex+1<sizeOfList) {
				if(c.get(startIndex+1)==1) {
					startIndex+=2;
					numberOfJumps++;
					continue;
				} else if(c.get(startIndex+1)==0) {
					if(startIndex+2<sizeOfList && c.get(startIndex+2)==0) {
						numberOfJumps++;
						startIndex+=2;
					} else {
						numberOfJumps+=1;
						startIndex+=1;
					}
				}
			}
		}
		return numberOfJumps;
	}
}
