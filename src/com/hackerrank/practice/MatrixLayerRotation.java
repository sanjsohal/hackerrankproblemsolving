package com.hackerrank.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixLayerRotation {
	public static void main(String...args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		List<Integer> list2 = Arrays.asList(12,1,2,5);
		List<Integer> list3 = Arrays.asList(11,4,3,6);
		List<Integer> list4 = Arrays.asList(10,9,8,7);
		List<List<Integer>> listOfLists = new ArrayList<>();
		listOfLists.add(list1);
		listOfLists.add(list2);
		listOfLists.add(list3);
		listOfLists.add(list4);
		matrixRotation(listOfLists,2);
	}
	public static void matrixRotation(List<List<Integer>> matrix, int r) {
	    for(int outerIndex = 0;outerIndex<matrix.size();outerIndex++) {
	    	if(outerIndex == 0 || outerIndex == matrix.size()-1) {
	    		List<Integer> row = matrix.get(outerIndex);
		    	for(int innerIndex = 0;innerIndex<row.size();innerIndex++) {
		    		if(innerIndex == row.size()-1 && (outerIndex+1)<matrix.size()) {
		    			row.set(innerIndex, matrix.get(outerIndex+1).get(innerIndex));
		    		} else 
		    		row.set(innerIndex, row.get(innerIndex+1));
		    	}
	    		matrix.set(outerIndex, row);
	    	} else {
	    		List<Integer> row = matrix.get(outerIndex);
	    		for(int innerIndex = 0;innerIndex<row.size();innerIndex++) {
	    			if(innerIndex == 0) {
	    				row.set(innerIndex, matrix.get(outerIndex-1).get(innerIndex));
	    			} else if(innerIndex == row.size()-1) {
	    				row.set(innerIndex, matrix.get(outerIndex-1).get(row.size()-1));
	    			} else {
	    				row.set(innerIndex, row.get(innerIndex+1));
	    			}
	    		}
	    		matrix.set(outerIndex, row);
	    	}
	    }
    	System.out.println(matrix);
	 }

}
