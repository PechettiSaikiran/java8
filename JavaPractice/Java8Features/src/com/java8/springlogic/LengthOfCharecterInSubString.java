package com.java8.springlogic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthOfCharecterInSubString {
	public static void main(String[] args) {
		int length = getNoOfChar("How is your Health",'i');
		System.out.println(length);
		duplicate("How is your Health");
	}

	private static int getNoOfChar(String str, char ch) {
		if(str==null || str.isEmpty()) {
			throw new RuntimeException("String is can not be null or empty");
		}
		return str
				.substring(str.indexOf(ch))
				.replace(" ", "")
				.toCharArray()
				.length;

	}
	
	static void duplicate(String str) {
		Map<Character, Long> result = str.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		for(Map.Entry<Character, Long> map : result.entrySet()) {
			System.out.println(map.getKey()+" : " + map.getValue());
			
		}
	}

}
