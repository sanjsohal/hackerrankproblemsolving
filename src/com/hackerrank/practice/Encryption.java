package com.hackerrank.practice;

import java.util.ArrayList;
import java.util.List;

public class Encryption {
	public static void main(String...args) {
		String s = encryption("feedthedog");
		System.out.println(s);
	}
	public static String encryption(String s) {
		String stringWithoutSpaces = s.replaceAll("\\s", "");
		int lengthOfString = stringWithoutSpaces.length();
		double value = Math.sqrt(lengthOfString);
		int integerValue = (int)value;
		int rows = 0;
		int columns = 0;
		if(value>integerValue&& value<integerValue+1) {
			rows = integerValue;
			columns = integerValue+1;
		} else {
			rows = integerValue;
			columns = integerValue;
		}
			while((rows*columns)<lengthOfString) {
				if(rows<columns) {
					rows++;
				} else if(columns<rows) {
					columns++;
				} else {
					rows++;
					columns++;
				}
			}
			List<String> listOfStrings = new ArrayList<String>();
			for(int i=0;i<stringWithoutSpaces.length();i+=columns) {
				if(i+columns>=lengthOfString) {
					listOfStrings.add(stringWithoutSpaces.substring(i, lengthOfString));
					
				} else 
					listOfStrings.add(stringWithoutSpaces.substring(i,i+columns));
			}
			
			
			String fullWord = "";
			for(int i = 0;i<columns;i++) {
				String smallWord = "";
				for(int j = 0;j<rows && j<listOfStrings.size();j++) {
					if(i<listOfStrings.get(j).length())					
					smallWord+=listOfStrings.get(j).charAt(i);
				}
				fullWord+=smallWord+" ";
			}
			fullWord = fullWord.substring(0,fullWord.length()-1);
		return fullWord;
	}
}
