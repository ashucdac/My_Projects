package com.java.Common;

public class OverloadingDemo {

	public void hello() {
		System.out.println("hello");
	}
	private void hello(int i) {
		System.out.println("hello i");
		hello();
	}
	public void hello(int i, int j) {
		System.out.println("hello i, j");
		hello();
		hello("abc");
	}
	public static void hello(String str) {
		System.out.println("static");
//		hello();
	}
	
//	OverloadingDemo obj = new OverloadingDemo();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo obj1 = new OverloadingDemo();
		obj1.hello();
	}

}
