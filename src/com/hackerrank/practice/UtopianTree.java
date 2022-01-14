package com.hackerrank.practice;

public class UtopianTree {
	public static void main(String...args) {		
		System.out.println(utopianTree(4));
	}
	public static int utopianTree(int n) {
		int height = 0;
		for(int i = 0;i<=n;i++) {
			if(i%2!=0) {
				height*=2;
			} else height++;
	    }
			return height;
	  }
}
