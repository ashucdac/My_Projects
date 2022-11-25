package com.java.palindrome;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter the Data : ");
		Scanner sc = new Scanner(System.in);
		String str =  sc.nextLine();
		String reverseStr = "";
		for(int i = str.length()-1; i>-1; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		System.out.println(reverseStr);
		if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println("The Given String is Palindrome !");
		}else {
			System.out.println("Not a Palindrome !!!");
		}

	}

}
