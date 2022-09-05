package com.java8.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Intersectionof2Arrays {

	public static void main(String[] args) {

		Intersectionof2Arrays intersectionof2Arrays = new Intersectionof2Arrays();
		int[] x = { 1, 2, 3, 4, 5, 6 };
		int[] y = { 1, 0, 9, 8, 7, 6, 5, 4 };

		int[] intersectionArray = intersectionof2Arrays.getIntersectionByContains(x, y);
		System.out.println("using Frequency of size: "+ intersectionArray.length);
		for (int i : intersectionArray) {
			System.out.println(i);
		}

		int[] intersectionOfArraysUsingRetainALL = intersectionof2Arrays.getIntersectionOfArraysUsingRetainALL(x, y);
		System.out.println("using retainAll of size: " +intersectionOfArraysUsingRetainALL.length);
		for (int i : intersectionOfArraysUsingRetainALL) {
			System.out.println(i);
		}
	}

	@SuppressWarnings("removal")
	private int[] getIntersectionOfArraysUsingRetainALL(int[] x, int[] y) {

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> intersectedArray = new ArrayList<>();
		Collections.addAll(list1, Arrays
									.stream(x)
									.boxed()
									.toArray(Integer[]::new));
		Collections.addAll(list2, Arrays
									.stream(y)
									.boxed()
									.toArray(Integer[]::new));
		intersectedArray.addAll(list1);
		intersectedArray.retainAll(list2);

		return intersectedArray
				.stream()
				.mapToInt(Integer::new)
				.toArray();
	}

	@SuppressWarnings("removal")
	private int[] getIntersectionByContains(int[] x, int[] y) {

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		Collections.addAll(list1, Arrays
									.stream(x)
									.boxed()
									.toArray(Integer[]::new));
		Collections.addAll(list2, Arrays
									.stream(y)
									.boxed()
									.toArray(Integer[]::new));
		list1 = list1
				.stream()
				.filter(list2::contains)
				.collect(Collectors.toList());

		return list1
				.stream()
				.mapToInt(Integer::new)
				.toArray();
	}

}
