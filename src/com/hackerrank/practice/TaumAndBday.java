package com.hackerrank.practice;

import java.math.BigInteger;
import java.util.Objects;

public class TaumAndBday {
	public static void main(String...args) {
		System.out.println(taumBday(27984,1402,619246,615589,247954));
		
	}
	public static long taumBday(int b, int w, int bc, int wc, int z) {
    	Long numberOfBlackGifts = Long.valueOf(b);
    	Long costOfBlackGift = Long.valueOf(bc);
    	Long numberOfWhiteGifts = Long.valueOf(w);
    	Long costOfWhiteGift = Long.valueOf(wc);
    	Long conversionCost = Long.valueOf(z);
		if(Objects.equals(costOfBlackGift, costOfWhiteGift)) {
	    	Long totalCost = numberOfBlackGifts*costOfBlackGift+numberOfWhiteGifts*costOfWhiteGift;	    	
	    	return totalCost;
	    }
	    if(bc>=wc+z) {
	    	Long convertedCostForBlack = costOfWhiteGift+conversionCost;
	    	Long totalCost = numberOfBlackGifts*convertedCostForBlack+numberOfWhiteGifts*costOfWhiteGift;
	    	return totalCost;
	    }
	    if(wc>=bc+z) {
	    	Long convertedCostForWhite = costOfBlackGift+conversionCost;
	    	Long totalCost = numberOfWhiteGifts*convertedCostForWhite+costOfBlackGift*numberOfBlackGifts;
	    	return totalCost;
	    }
	    Long totalCost = numberOfBlackGifts*costOfBlackGift+numberOfWhiteGifts*costOfWhiteGift;
		return totalCost;
	}
}
