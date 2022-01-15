package com.hackerrank.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CutTheSticks {
	public static void main(String...args) {
		List<Integer> sticks = new ArrayList<>();
		sticks.add(1);
		sticks.add(2);
		sticks.add(3);
		sticks.add(4);
		sticks.add(3);
		sticks.add(3);
		sticks.add(2);
		sticks.add(1);
		System.out.println(cutTheSticks(sticks));
	}
	public static List<Integer> cutTheSticks(List<Integer> ar){
		List<Integer> listToReturn = new ArrayList<>();
		while(!ar.isEmpty()) {
			listToReturn.add(ar.size());
			int min = Collections.min(ar);
			ar.removeIf(e->e.equals(min));
			ar.stream().map(e->e-min);
		}
		return listToReturn;
	}
}
