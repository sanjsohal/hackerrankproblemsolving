package com.hackerrank.practice;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
	public static void main(String...args) {
		List<Integer> input = Arrays.asList(-4,3,-9,0,4,1);
		plusMinus(input);
	}
	public static void plusMinus(List<Integer> arr) {
        int numberOfDigitsLessThanZero = 0;
        int numberOfDigitsEqualToZero = 0;
        int numberOfDigitsGreaterThanZero = 0;
        for(Integer i:arr){
            if(i<0){
                numberOfDigitsLessThanZero+=1;
            } else if(i>0){
                numberOfDigitsGreaterThanZero+=1;
            } else {
                numberOfDigitsEqualToZero+=1;
            }
        }
        int sizeOfArray = arr.size();
        double lessThanZero = (double)numberOfDigitsLessThanZero/sizeOfArray;
        double equalToZero = (double)numberOfDigitsEqualToZero/sizeOfArray;
        double greaterThanZero = (double)numberOfDigitsGreaterThanZero/sizeOfArray;
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(lessThanZero));
        System.out.println(df.format(equalToZero));
        System.out.println(df.format(greaterThanZero));
    }
}
