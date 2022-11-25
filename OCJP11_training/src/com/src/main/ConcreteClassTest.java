package com.src.main;

public class ConcreteClassTest implements FunctionalInterfaceDemo {

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		FunctionalInterfaceDemo obj = new ConcreteClassTest();
		obj.defaultMethod();

		FunctionalInterfaceDemo.staticMethod();

	}
}
