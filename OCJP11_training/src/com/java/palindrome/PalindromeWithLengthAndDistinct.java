package com.java.palindrome;

import java.util.Scanner;

public class PalindromeWithLengthAndDistinct {
	
	public static String createPalindrome(int l, int d) {
		String str = "";
		for(int i = 0; i<d; i++) {
			str = str + (char) ('a'+i);
		}
		int count = 0;
		for(int i = 0; i<l-d; i++) {
			str = str+(char)('a'+count);
			count++;
			if(count == d) {
				count = 0;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Length : ");
		 int l = sc.nextInt();
		 
		 System.out.println("Enter Distict : ");
		 int d = sc.nextInt();
		 String result = PalindromeWithLengthAndDistinct.createPalindrome(l, d);
		 String reverse = new StringBuilder(result).reverse().toString();
		 if(result.equals(reverse)) {
			 System.out.println(result+ " is A palindrome");
		 }else {
			 System.out.println(result+ " is not a palindrome");
		 }
	}

}
