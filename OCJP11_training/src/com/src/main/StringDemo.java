package com.src.main;

public class StringDemo {

	public static void main(String[] args) {
		String str ="         ";
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		
		String string4 = "\n\n\tHello \0 Java \u2000\t\n";
		System.out.println("Trim : "+string4.trim());
		System.out.println("Strip : "+string4.strip());
		System.out.println(string4.trim().length());
        System.out.println(string4.strip().length());
        
        System.out.println("******");
        
		StringBuilder builder=new StringBuilder(10);
		builder.ensureCapacity(20);
		System.out.println(builder.capacity());
		System.out.println(builder.length());
		builder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");  // (2*current_capacity)+2;
		System.out.println(builder);
		System.out.println(builder.capacity());
		System.out.println(builder.length());
		builder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");  //
		System.out.println(builder.capacity());
		System.out.println(builder.length());
	}

}
