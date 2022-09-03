package com.java8.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfList {

	public static void main(String[] args) {
		IntersectionOfList intersectionOfList= new IntersectionOfList();
		List<String> list1= Arrays.asList("Kiran","Rathan","Manga","samba","Tripura","Sunishith");
		List<String> list2= Arrays.asList("Kiran","Sunishith","lasya","samba","prakash","prasad","ravi","lavanya");
		
		System.out.println("Using Retain All");
		List<String> intersectedSet =  intersectionOfList.getIntersectedListByRetainAll(list1,list2);
		System.out.println(intersectedSet);
		
		System.out.println("Using contains");

		List<String> intersectedList = intersectionOfList.getIntersectionByContains(list1, list2);
		System.out.println(intersectedList);
	}

	private <T>List<T> getIntersectedListByRetainAll(List<T> list1, List<T> list2) {
		List<T> retainedList = new ArrayList<>();
		retainedList.addAll(list1);
		retainedList.retainAll(list2);
		return retainedList;
	}
	
	private <T>List<T> getIntersectionByContains(List<T> list1,List<T> list2){
		return list1
				.stream()
				.filter(list2::contains)
				.collect(Collectors.toList());
				
	}
}
