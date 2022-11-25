package com.java.boi;

public class FactorialDemo {

	public static int facto(int i) {
		int j = 1;
		if (i == 1) {
			return 1;
		} else {
			j = i * facto(i - 1);
		}

		return j;
	}

	public static void main(String[] args) {
		System.out.println(facto(5));
	}
}
