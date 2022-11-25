package com.src.innerInterface;

public class InnerInterfaceDemo {

	interface myInterface {
		void demo();
	}

	class Inner implements myInterface {
		public void demo() {
			System.out.println("Welcome");
		}
	}

	public static void main(String args[]) {
		Inner obj = new InnerInterfaceDemo().new Inner();
		obj.demo();
	}

}
