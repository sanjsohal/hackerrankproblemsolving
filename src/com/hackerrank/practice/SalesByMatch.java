package com.hackerrank.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
	public static void main(String...args) {
		System.out.println(sockMerchant(7,Arrays.asList(1,2,1,2,1,3,2)));
	}
	public static int sockMerchant(int n,List<Integer> ar) {
		int numberOfPairs = 0;
		Map<Integer,Integer> countOfNumbers = new HashMap<Integer,Integer>();
		for(int index = 0;index<ar.size();index++) {
			if(countOfNumbers.containsKey(ar.get(index)))
			{
				countOfNumbers.put(ar.get(index), countOfNumbers.get(ar.get(index))+1);
			} else {
				countOfNumbers.put(ar.get(index), 1);
			}
		}
		for(Map.Entry<Integer, Integer> element:countOfNumbers.entrySet()) {
			int pairs = element.getValue()/2;
			numberOfPairs+=pairs;
		}
		return numberOfPairs;
	}
}
