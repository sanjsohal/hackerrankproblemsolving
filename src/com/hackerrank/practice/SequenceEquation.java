package com.hackerrank.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SequenceEquation {
	public static void main(String...args) {
		List<Integer>  list = Arrays.asList(5,2,1,3,4);
		System.out.println(permutationEquation(list));
			}
	public static List<Integer> permutationEquation(List<Integer> p) {
		int max = Collections.max(p);
		List<Integer> list2 = new ArrayList<>();
		for(int i = 1;i<=max;i++) {
			int pointA = p.indexOf(i);
			pointA = pointA+1;
			int pointB = p.indexOf(pointA);
			pointB++;
			list2.add(pointB);	
		}
			return list2;
	    }
}
