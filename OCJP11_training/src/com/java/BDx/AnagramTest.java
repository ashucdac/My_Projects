package com.java.BDx;

import java.util.Arrays;

public class AnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hitler Woman";
		String str2 = "Mother in law";
		
		String s1 = str1.replaceAll("[^a-zA-Z]+", "");
		String s2 = str2.replaceAll("[^a-zA-Z]+", "");

		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		Arrays.sort(c1);Arrays.sort(c2);
		System.out.println(c1);System.out.println(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println("This is Anagram");
		}else {
			System.out.println("This is not an Anagram");
		}
	}

}