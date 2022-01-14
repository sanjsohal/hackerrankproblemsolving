package com.hackerrank.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
	public static int diagonalDifference(List<List<Integer>> arr) {
	    // Write your code here
	        int sumOfFirstDiagonal = 0;
	        int sumOfSecondDiagonal = 0;
	        for(int i = 0,j=arr.size()-1;i<arr.size() && j>=0;i++,j--){
	            List<Integer> subList = arr.get(i);
	            sumOfFirstDiagonal+=subList.get(i);
	            sumOfSecondDiagonal+=subList.get(j);
	        }
	        int result = 0;
	        if(sumOfFirstDiagonal>sumOfSecondDiagonal){
	            result = sumOfFirstDiagonal - sumOfSecondDiagonal;
	        } else if(sumOfSecondDiagonal>sumOfFirstDiagonal) {
	            result = sumOfSecondDiagonal - sumOfFirstDiagonal;
	        }
	        return result;
	    }
	public static void main(String...args) {
		List<List<Integer>> inputList = new ArrayList<>();
		List<Integer> firstRow = Arrays.asList(1,2,3);
		List<Integer> secondRow = Arrays.asList(4,5,6);
		List<Integer> thirdRow = Arrays.asList(9,8,9);
		inputList.add(firstRow);
		inputList.add(secondRow);
		inputList.add(thirdRow);
		int result = diagonalDifference(inputList);
		System.out.println("Result======>"+result);
	}
}


