package com.hackerrank.practice;

import java.util.Arrays;
import java.util.List;

class ReturnBill{
	public static void bonAppetit(List<Integer> bill, int k, int b) {
			int minimumNumberOfItemsAllowed = 2;
			int maximumNumberOfItemsAllowed = 100000;
			int minimumCostOfItemAllowed = 0;
			int maximumCostOfItemAllowed = 10000;
			int numberOfItems = bill.size();
			if(numberOfItems>=minimumNumberOfItemsAllowed && numberOfItems<=maximumNumberOfItemsAllowed
					&& k>=minimumCostOfItemAllowed && k<numberOfItems) {
				int sumOfItemsShared = 0;
				for(int index = 0;index<bill.size();index++) {
					if(index == k) {
						continue;
					} else {
						int costOfItem = bill.get(index);
						if(costOfItem>=minimumCostOfItemAllowed && costOfItem<=maximumCostOfItemAllowed) {
							sumOfItemsShared+=costOfItem;
						}
					}
				}
				int sharedPrice = sumOfItemsShared/2;
				if(sharedPrice==b) {
					System.out.println("Bon Appetit");
				} else if(sharedPrice<b) {
					System.out.println(b-sharedPrice);
				}
			}
			
	    }
}
public class BillDivision {
	public static void main(String...args) {
		ReturnBill.bonAppetit(Arrays.asList(null), 2, 5);
	}
}
