package com.java8.springlogic;

import javax.management.RuntimeErrorException;

public class LengthOfCharecterInSubString {
	public static void main(String[] args) {
		int length = getNoOfChar("How is your Health",'i');
		System.out.println(length);
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

}
