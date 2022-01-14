package com.hackerrank.practice;

public class TheTimeInWords {
	public static void main(String...args) {
		System.out.println(timeInWords(5,47));
	}
	public static String timeInWords(int h, int m) {
	    // Write your code here
		String valueToReturn = "";
		String minutesPast = "";
		String selectHour = "";
		if(m>30 && m<60) {
			h+=1;
		}
		switch(h) {
		case 1:
			selectHour = "one";
			break;
		case 2:
			selectHour = "two";
			break;
		case 3:
			selectHour = "three";
			break;
		case 4:
			selectHour = "four";
			break;
		case 5:
			selectHour = "five";
			break;
		case 6:
			selectHour = "six";
			break;
		case 7:
			selectHour = "seven";
			break;
		case 8:
			selectHour = "eight";
			break;
		case 9:
			selectHour = "nine";
			break;
		case 10:
			selectHour = "ten";
			break;
		case 11:
			selectHour = "eleven";
			break;
		case 12:
			selectHour = "twelve";
			break;
		}
		if(m == 0) {
			minutesPast = "o' clock";
			valueToReturn = selectHour+" "+minutesPast;
		} else if(m>=1 && m<=30) {
			switch(m) {
			case 1:
				minutesPast = "one minute past";
				break;
			case 2:
				minutesPast = "two minutes past";
				break;
			case 3:
				minutesPast = "three minutes past";
				break;
			case 4:
				minutesPast = "four minutes past";
				break;
			case 5:
				minutesPast = "five minutes past";
				break;
			case 6:
				minutesPast = "six minutes past";
				break;
			case 7:
				minutesPast = "seven minutes past";
				break;
			case 8:
				minutesPast = "eight minutes past";
				break;
			case 9:
				minutesPast = "nine minutes past";
				break;
			case 10:
				minutesPast = "ten minutes past";
				break;
			case 11:
				minutesPast = "eleven minutes past";
				break;
			case 12:
				minutesPast = "twelve minutes past";
				break;
			case 13:
				minutesPast= "thirteen minutes past";
				break;
			case 14:
				minutesPast = "fourteen minutes past";
				break;	
			case 15:
				minutesPast = "quarter past";
				break;
			case 16:
				minutesPast = "sixteen minutes past";
				break;
			case 17:
				minutesPast = "seventeen minutes past";
				break;
			case 18:
				minutesPast = "eighteen minutes past";
				break;
			case 19:
				minutesPast = "nineteen minutes past";
				break;
			case 20:
				minutesPast = "twenty minutes past";
				break;
			case 21:
				minutesPast = "twenty one minutes past";
				break;
			case 22:
				minutesPast = "twenty two minutes past";
				break;
			case 23:
				minutesPast = "twenty three minutes past";
				break;
			case 24:
				minutesPast = "twenty four minutes past";
				break;
			case 25:
				minutesPast = "twenty five minutes past";
				break;
			case 26:
				minutesPast = "twenty six minutes past";
				break;
			case 27:
				minutesPast = "twenty seven minutes past";
				break;
			case 28:
				minutesPast = "twenty eight minutes past";
				break;
			case 29:
				minutesPast = "twenty nine minutes past";
				break;
			case 30:
				minutesPast = "half past";
				break;
			}
			valueToReturn = minutesPast +" "+selectHour;
		} else if(m>30 && m<60) {
			int twoMinutes = 60-m;
			switch(twoMinutes) {
			case 1:
				minutesPast = "one minute to";
				break;
			case 2:
				minutesPast = "two minutes to";
				break;
			case 3:
				minutesPast = "three minutes to";
				break;
			case 4:
				minutesPast = "four minutes to";
				break;
			case 5:
				minutesPast = "five minutes to";
				break;
			case 6:
				minutesPast = "six minutes to";
				break;
			case 7:
				minutesPast = "seven minutes to";
				break;
			case 8:
				minutesPast = "eight minutes to";
				break;
			case 9:
				minutesPast = "nine minutes to";
				break;
			case 10:
				minutesPast = "ten minutes to";
				break;
			case 11:
				minutesPast = "eleven minutes to";
				break;
			case 12:
				minutesPast = "twelve minutes to";
				break;
			case 13:
				minutesPast= "thirteen minutes to";
				break;
			case 14:
				minutesPast = "fourteen minutes to";
				break;	
			case 15:
				minutesPast = "quarter to";
				break;
			case 16:
				minutesPast = "sixteen minutes to";
				break;
			case 17:
				minutesPast = "seventeen minutes to";
				break;
			case 18:
				minutesPast = "eighteen minutes to";
				break;
			case 19:
				minutesPast = "nineteen minutes to";
				break;
			case 20:
				minutesPast = "twenty minutes to";
				break;
			case 21:
				minutesPast = "twenty one minutes to";
				break;
			case 22:
				minutesPast = "twenty two minutes to";
				break;
			case 23:
				minutesPast = "twenty three minutes to";
				break;
			case 24:
				minutesPast = "twenty four minutes to";
				break;
			case 25:
				minutesPast = "twenty five minutes to";
				break;
			case 26:
				minutesPast = "twenty six minutes to";
				break;
			case 27:
				minutesPast = "twenty seven minutes to";
				break;
			case 28:
				minutesPast = "twenty eight minutes to";
				break;
			case 29:
				minutesPast = "twenty nine minutes to";
				break;			
			}
			valueToReturn = minutesPast+" "+selectHour;
		}
		return valueToReturn;
	 }
}
