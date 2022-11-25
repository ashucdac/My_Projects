package com.src.main;


abstract class AA{
	int i;
	String str;
	public AA(){
		System.out.println("AA Constructor");
	}
	abstract void helloMethod();
	public void otherMethod() {
		System.out.println("OtherMethod AA");
	}
}

class BB extends AA{
	@Override
	void helloMethod() {
		System.out.println("Hello Method !!!");
	}
	public void otherMethod() {
		System.out.println("OtherMethod BB");
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		BB bb = new BB();
		bb.otherMethod();

	}

}
