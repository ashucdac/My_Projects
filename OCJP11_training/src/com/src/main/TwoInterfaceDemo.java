package com.src.main;

interface A{
	public void testMethod();
}
interface B{
	public void testMethod();
}

class C  implements A,B{
	@Override
	public void testMethod() {
		// TODO Auto-generated method stub
		
	}
}
public class TwoInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.testMethod();

	}


}
