package com.java8.logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElemments {

	public static void main(String[] args) {
		
		DuplicateElemments duplicateElemments = new DuplicateElemments();
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5,4,8,5,7,8,9);

		System.out.println("using Frequency");
		Set<Integer> duplicateElements= duplicateElemments.getDuplicateByFrequency(numberList);
		duplicateElements.forEach(System.out::println);
		
		System.out.println("using grouping");
		Set<Integer> duplicateElementsUsingGrouping=duplicateElemments.getDuplicateByGrouping(numberList);
		duplicateElementsUsingGrouping.forEach(System.out::println);
		
		System.out.println("using SETADD");
		Set<Integer> duplicateElementsUsingSetAdd=duplicateElemments.getDuplicateSetAdd(numberList);
		duplicateElementsUsingSetAdd.forEach(System.out::println);
	}
	
	public <T> Set<T> getDuplicateByFrequency(List<T> elementsList){
		
		return elementsList.stream()
		.filter(a->Collections.frequency(elementsList, a)>1)
		.collect(Collectors.toSet());
	
	}

	public <T> Set<T> getDuplicateByGrouping(List<T> elementsList) {
		return elementsList
				.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(m->m.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());

	}
	
	public <T> Set<T> getDuplicateSetAdd(List<T>elementList){
		Set<T> items= new HashSet<>();
		return elementList
				.stream()
				.filter(a->!items.add(a))
				.collect(Collectors.toSet());
	}
	
	
}
