package com.java8.logic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EvenNumbersInList {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,4,5,6,75,5,55,44,22,2,3,4);
		List<Integer> evenList=getEvenNumberList(numberList);
		
		System.out.println("Even number List");
		evenList.forEach(System.out::println);;

		//To get first element
		Optional<Integer> i= numberList.
								stream()
								.findFirst();
		if(i.isPresent()) {
			System.out.println(i.get());
		}
		
		
	}
	
			

	private static List<Integer> getEvenNumberList(List<Integer> numberList) {
		return numberList.stream()
				.filter(x->x%2==0)
				.distinct()
				.collect(Collectors.toList());
	}
}
