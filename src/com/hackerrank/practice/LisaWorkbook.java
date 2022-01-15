package com.hackerrank.practice;

import java.util.Arrays;
import java.util.List;

public class LisaWorkbook {
	public static void main(String...args) {
		List<Integer> chapters = Arrays.asList(3,8,15,11,14,1,9,2,24,31);
		System.out.println(workbook(10,5,chapters));
		List<Integer> chapters2 = Arrays.asList(4,2,6,1,10);
		System.out.println(workbook(5,3,chapters2));
		List<Integer> chapters3 = Arrays.asList(1, 29, 94, 15, 87, 100);
		System.out.println(workbook(6,10,chapters3));
	}
	public static int workbook(int n, int k, List<Integer> arr) {
		int chaptersCovered = 0;
		int currentPage = 0;
		int specialPages = 0;
		while(chaptersCovered<n) {
			int problemsToCoverInCurrentChapter = arr.get(chaptersCovered);

			chaptersCovered++;
			if(problemsToCoverInCurrentChapter<=k) {
				currentPage++;
				for(int p = 1;p<=problemsToCoverInCurrentChapter;p++) {
					if(p==currentPage) {
						specialPages++;
						break;
					}
				}
			} else {
				int remainingProblems = problemsToCoverInCurrentChapter%k;
				if(remainingProblems == 0) {
					for(int i = 1;i<=problemsToCoverInCurrentChapter;i+=k) {
						currentPage++;
						int startIndex = i;
						int endIndex = startIndex+k-1;
						if(currentPage>=startIndex&& currentPage<=endIndex) {
							specialPages++;
						}
					}
				} else {
					int problemsEquallyDivided = problemsToCoverInCurrentChapter/k;
					for(int i = 1;i<=problemsEquallyDivided*k;i+=k) {
						currentPage++;
						int startIndex = i;
						int endIndex = startIndex+k-1;
						if(currentPage>=startIndex&& currentPage<=endIndex) {
							specialPages++;
						}
					}
					currentPage++;
					if(currentPage>=problemsEquallyDivided*k+1 && currentPage<=problemsEquallyDivided*k+remainingProblems) {
						specialPages++;
					}
				}
			}
		}
		
		return specialPages;
	}
}
