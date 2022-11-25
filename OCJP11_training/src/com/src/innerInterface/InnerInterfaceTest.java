package com.src.innerInterface;

class Test{
	interface myInnerInterface{
		void demo();
	}
}

public class InnerInterfaceTest implements Test.myInnerInterface {
	@Override
	public void demo() {
		System.out.println("Hello");
		
	}
	public static void main(String[] args) {
		InnerInterfaceTest obj = new InnerInterfaceTest();
		obj.demo();
	}

}
