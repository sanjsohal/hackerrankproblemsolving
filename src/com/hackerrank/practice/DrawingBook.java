package com.hackerrank.practice;

public class DrawingBook {
	public static void main(String...args) {
		int pages = pageCount(6,5);
		System.out.println(pages);
	}
	public static int pageCount(int n, int p) {
		if(p ==n )return 0;
        int pagesFlipped = 0; 
        int numberOfPagesFromBack = n-p;
        int numberOfPagesFromFront = p-1;
        if(numberOfPagesFromBack<numberOfPagesFromFront) {
            if(numberOfPagesFromBack%2==0) {
                pagesFlipped = numberOfPagesFromBack/2;
            } else {
            	if((numberOfPagesFromBack/2)>0)
                pagesFlipped = (numberOfPagesFromBack/2)+1;
            	else pagesFlipped = 0;
            }
        } else if(numberOfPagesFromFront<numberOfPagesFromBack){
           if(numberOfPagesFromFront%2 ==0) {
                    pagesFlipped = (numberOfPagesFromFront/2);
                } else 
                pagesFlipped = (numberOfPagesFromFront/2)+1;
        }
        if(numberOfPagesFromBack == numberOfPagesFromFront) {
            pagesFlipped = (numberOfPagesFromBack/2);
        }
        return pagesFlipped;
	}
}
