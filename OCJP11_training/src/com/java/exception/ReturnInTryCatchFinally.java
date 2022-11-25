package com.java.exception;

import java.io.File;

public class ReturnInTryCatchFinally {

	public int testReturn(int i) {
		try {
			int n = 2 / i;
			System.out.println("try");
			return 1;
		} catch (ArithmeticException e) {
			System.out.println("Catch");
			return 2;
		} finally {
			return 3;
		}
	}

	public static void main(String[] args) {
		ReturnInTryCatchFinally obj = new ReturnInTryCatchFinally();

//		System.out.println(obj.testReturn(1));
		System.out.println(obj.testReturn(0));
	}

}
