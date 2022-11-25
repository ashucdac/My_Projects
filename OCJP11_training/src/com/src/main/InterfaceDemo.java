package com.src.main;

interface Interface1 {
	default void defaultMethod() {
		System.out.println("Interface1 default method");
	}
}

interface Interface2 {
	default void defaultMethod() {
		System.out.println("Interface2 default method");
	}
}

class ImplementedClass implements Interface1, Interface2 {
	public void defaultMethod() {
		System.out.println("Class default method");
		Interface1.super.defaultMethod();
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Interface1 i1 = new ImplementedClass();
		i1.defaultMethod();
	}

}