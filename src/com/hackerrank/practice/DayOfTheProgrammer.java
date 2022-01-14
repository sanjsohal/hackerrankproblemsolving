package com.hackerrank.practice;

public class DayOfTheProgrammer {
	public static void main(String...args) {
		System.out.println(dayOfProgrammer(2100));
	}
	public static String dayOfProgrammer(int year) {
		int numberOfDaysToSubtract = 0;
		if(year%4==0 && year%400==0 && year%100!=0) {
			numberOfDaysToSubtract=244;
		} else {
			numberOfDaysToSubtract = 243;
		}
		int date = 256-numberOfDaysToSubtract;
		String dateToReturn = date+".09."+year;
		return dateToReturn;
	}
}
