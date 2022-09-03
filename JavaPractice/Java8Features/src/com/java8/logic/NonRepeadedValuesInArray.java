package com.java8.logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeadedValuesInArray {

	public static void main(String[] args) {
 
		NonRepeadedValuesInArray nonRepeadedValuesInArray = new NonRepeadedValuesInArray();
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5,4,8,5,7,8,9);

		Set<Integer> numberSet= nonRepeadedValuesInArray.getNonRepeatedValuesUsingGroupingBy(numberList);
		numberSet.forEach(System.out::println);
		System.out.println("Collectiosn Frequency");
		Set<Integer> numberSet1= nonRepeadedValuesInArray.getNonRepeatedValuesUsingFrequent(numberList);
		numberSet1.forEach(System.out::println);
	}

	private <T>Set<T> getNonRepeatedValuesUsingGroupingBy(List<T> numberList) {
		return numberList
				.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(b->b.getValue()==1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());
		// TODO Auto-generated method stub
		
	}
	
	private <T> Set<T> getNonRepeatedValuesUsingFrequent(List<T> elementList){
		return elementList.stream()
				.filter(a->Collections.frequency(elementList, a)==1)
				.collect(Collectors.toSet());
	}

}
