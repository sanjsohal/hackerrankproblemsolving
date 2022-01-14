package com.hackerrank.practice;

public class StairCase {
    public static void staircase(int n) {
    // Write your code here
    	for(int i=0;i<n;i++) {
    		for(int j= i;j<n-1;j++) {
    			System.out.print("#");
    		}
    		for(int k = 0;k<i+1;k++) {
    			System.out.print("$");
    		}
    		System.out.println();
    	}
    }
    public static void main(String...args) {
    	staircase(6);
    }
}
