package com.hackerrank.practice;

public class LibraryFine {
	public static void main(String...args) {
		System.out.println(libraryFine(14,7,2018,5,7,2018));
	}
	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {	    
		int fine = 0;
		if(y1>y2) {
			fine = 10000;
			return fine;
		}
		if(y1 == y2) {
			if(m1>m2) {
				fine = 500*(m1-m2);
				return fine;
			}else if(m1<m2) {fine = 0;return fine;}
			else {
				if(d1<=d2) {
					fine = 0;
					return fine;
				} else {
				fine = 15*(d1-d2);
				return fine;}
			}
		}
		return fine;
	}
}
