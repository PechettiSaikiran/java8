package com.java8.logic;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MaxNumberInArray {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4,0,5,4,8,5,7,8,9);
		
		int max=getMaxByStreams(numberList);
		System.out.println("Using Streams max"+max);
		
		int max2=getMaxByIntSummaryStatistics(numberList);
		System.out.println("Using Int Summary Statistics max"+max2);
		
	}

	private static int getMaxByIntSummaryStatistics(List<Integer> numberList) {
		
		IntSummaryStatistics intSummaryStatistics = numberList
				.stream()
				.mapToInt(x->x)
				.summaryStatistics();

		
		return intSummaryStatistics.getMax();
	}

	private static int getMaxByStreams(List<Integer> numberList) {
		if(numberList==null||numberList.isEmpty()) {
			throw new RuntimeException("NumberList is either null or empty");
		}
		//returns Optional[Integer]
		return numberList
				.stream()
				.max((x,y)->x.compareTo(y)).get();
	}

}
