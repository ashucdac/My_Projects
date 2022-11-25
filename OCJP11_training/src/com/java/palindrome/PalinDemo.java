package com.java.palindrome;

import java.util.Scanner;

public class PalinDemo {
	public static String createPalindrome(int l, int d) {
		char[] arr = new char[d*2];
		for (int i = 0; i < d; i++) {
			arr[i] = (char) ('a' + i);
		}
		int al = arr.length;
		if(al>l) {
			while(al!=l) {
//				arr.
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length : ");
		int l1 = sc.nextInt();

		System.out.println("Enter Distict : ");
		int d1 = sc.nextInt();
		String result = PalinDemo.createPalindrome(l1, d1);
		String reverse = new StringBuilder(result).reverse().toString();
		if (result.equals(reverse)) {
			System.out.println(result + " is A palindrome");
		} else {
			System.out.println(result + " is not a palindrome");
		}
	}

}
