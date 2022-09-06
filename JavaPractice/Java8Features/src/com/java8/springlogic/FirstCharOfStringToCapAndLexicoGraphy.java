package com.java8.springlogic;

import java.util.Scanner;

public class FirstCharOfStringToCapAndLexicoGraphy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		String newString = A.concat(B);
		int lenght = newString.length();
		System.out.println(lenght);

		int x = getValue(A, B);
		int y = compare(A, B);
		System.out.println("x " + x + " y " + y);

		if (x < 0) {
			System.out.println("No");
		} else if (x == 0) {
			System.out.println("A and B are same");
		} else {
			System.out.println("Yes");
		}
		A = getFirstIndexAsCap(A);
		B = getFirstIndexAsCap(B);
		String str = A + " " + B;
		System.out.println(str);
		
		sc.close();
	}

	public static String getFirstIndexAsCap(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	public static int getValue(String str, String str2) {
		return str.compareTo(str2);
	}

	public static int compare(String str, String str2) {

		int len1 = str.length();
		int len2 = str2.length();
		int min = Math.min(len1, len2);

		char[] ch1 = str.toCharArray();
		char[] ch2 = str2.toCharArray();
		for (int i = 0; i < min; i++) {
			if (ch1[i] != ch2[i]) {
				return ch1[i] - ch2[i];
			}
		}
		return len1 - len2;
	}
}
