package com.java8.logic;

import java.util.Arrays;
import java.util.List;

public class SumOfListElements {
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,4,5,6,75,5,55,44,22,2,3,4);
		int sum=numberList
				.stream()
				.reduce(0,Integer::sum);
		System.out.println(sum);
		
		

	}

}
