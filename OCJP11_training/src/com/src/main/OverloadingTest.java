package com.src.main;

public class OverloadingTest {
	
	public void addition(Number i, Number j) {
		System.out.println("1");
		Number a = i;
		Number b = j;
//		Number c = a;
		System.out.println("Hi");
	}
	public void addition(int i, int j) {
		System.out.println(i+j);
	}

	public static void main(String[] args) {
		
		OverloadingTest obj = new OverloadingTest();
		obj.addition(5, 5);
	}

}
