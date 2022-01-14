package com.hackerrank.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PickingNumbers {
	public static void main(String...args) {
		pickingNumbers(Arrays.asList(4,6,5,3,3,1));
	}
	 public static int pickingNumbers(List<Integer> a) {
		 for(int i = 0;i<a.size();i++) {
			 for(int j = i+1;j<a.size();j++) {
				 if((a.get(i)>a.get(j))&& (a.get(i)-a.get(j)<=1)) {
					 
				 }
			 }
		 }
		 return 0;
	}
}
