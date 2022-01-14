package com.hackerrank.practice;

import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {
	public static void main(String...args) {
		List<Integer> list = Arrays.asList(5,5,5,5,5);
		long min = 0l;
		long max = 0l;
		for(int i = 0;i<list.size();i++) {
			long tempSum = 0l;
			for(int j = 0;j<list.size();j++) {
				if(i!=j) {
					tempSum+=list.get(j);
				}
			}
			if(i ==0) {
				min = tempSum;
				max = tempSum;
			}
			if(i!=0 && tempSum>max) {
				max = tempSum;
			}
			if(i!=0 && tempSum<min) {
				min = tempSum;
			}
		}
		System.out.println("min===>"+min+" max=====>"+max);
		
	}
}
