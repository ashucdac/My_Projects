package com.java.Common;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReturnDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 4, 1, 6, 6, 2, 7, 9, 2 };
		int len = arr.length;
		int count = 1;
		int[] resultArr = new int[len];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					resultArr[i] = arr[i];
					count++;
				}
			}
			map.putIfAbsent(arr[i], count);
		}
		System.out.println(map);
		
		System.out.println("****************");
		String str = "I scream, you scream, we all scream for ice cream!";
		str = str.replaceAll("[^a-zA-Z]+"," ");
		
		String[] array = str.split(" ");
		System.out.println(str);
		int cnt = 1;
		Map<String, Integer> map1 = new LinkedHashMap<String, Integer>();
		for(int i =0; i<array.length; i++) {
			cnt = 1;
			for(int j = i+1; j< array.length; j++) {
				if(array[i].equals(array[j])) {
					cnt++;
				}
			}
			map1.putIfAbsent(array[i], cnt);
		}
		System.out.println(map1);
//		map1.forEach((i,j)->System.out.println(i+" --- "+j));
		
		System.out.println("****************");
		
		String chars = "AbbdSbssS Tygtyhb";
		chars = chars.replaceAll("[^a-zA-Z]+", "");
		char[] charss = chars.toCharArray();
		char[] resultChars = new char[charss.length];
		Map<Character, Integer> mapOfCharsCount = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i<charss.length; i++) {
			int cnt1 = 1;
			for(int j=i+1; j<charss.length; j++) {
				if(charss[i] == charss[j]) {
					resultChars[i] = charss[i];
					cnt1++;
				}
			}
			mapOfCharsCount.putIfAbsent(charss[i], cnt1);
		}
		System.out.println(mapOfCharsCount);
		
	}
}
