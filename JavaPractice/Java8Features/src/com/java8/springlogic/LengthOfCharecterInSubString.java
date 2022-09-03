package com.java8.springlogic;

public class LengthOfCharecterInSubString {
	public static void main(String[] args) {
		int length = getNoOfChar("How is your Health",'i');
		System.out.println(length);
	}

	private static int getNoOfChar(String str, char ch) {
		return str
				.substring(str.indexOf(ch))
				.replace(" ", "")
				.toCharArray()
				.length;

	}

}
