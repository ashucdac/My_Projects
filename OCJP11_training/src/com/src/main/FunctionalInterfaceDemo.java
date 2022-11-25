package com.src.main;


@FunctionalInterface
public interface FunctionalInterfaceDemo{
	
	void method1();
	default void defaultMethod() {System.out.println("default method");}
	static void staticMethod() {System.out.println("Static");}
	private void privateMethod() {}
	private static void privateStaticMethod() {}
	public String toString();
	public boolean equals(Object obj);
	default void defaultMethod1() {System.out.println("default method");}
	static void staticMethod1() {System.out.println("Static");}
	private void privateMethod1() {}
	private static void privateStaticMethod1() {}
//	public String toString1();
//	public boolean equals1(Object obj);
}


