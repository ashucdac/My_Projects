package com.src.main;

import java.util.ArrayList;
import java.util.List;

public class TestVar {
	
//	var s = 12;			// var can not be used as instance variable. 

//	public void addition(var a, var b) {}	// var not allowed in method arguments
//	public var addition() { return 2;}	// var not allowed as return type
	
	static {
		var val = 1;
		System.out.println("var in Static Block : "+val);
	}
	
	public static void main(String[] args) {

//		var v;			// var can not be used without explicit initialization
//		var v1 = null;		// var can not be initialized to null
		
//		var<var> roomNo = new ArrayList<var>();	// var not allowed in generic type;
		
		var v1 = 123;
		var v2 = 12.9;
		var v3 = 'a';
		var v4 = "Abhilasha";
		var v5 = true;
		var v6 = new ArrayList<String>();
		System.out.println(v1+" "+v2+" "+v3+" "+v4+" "+v5+" "+v6);
		
//		var [] intArray = new int[10];		// var is not allowed as an element type
		var numArray = new int[10];
		var numArray1 = new int[10][10];
//		var str = {"Abhinav", "Saranya", "Darshana"};	// incorrect :
		String [] strArray = {"Abhinav", "Saranya", "Darshana"};
		var strName = List.of("Abhinav", "Saranya", "Darshana");
		var copy = List.copyOf(strName);

		if(strName==copy) {
			System.out.println("List And Copy Are Same!!!");
		}
		
		 var<var> al = new ArrayList<>();	// incorrect : var can not be used as generic type
		 al.add(10);al.add(20);al.add(30);
		 System.out.println(al);
		
		System.out.println("*********"); 
		 
		var<String> empName = new ArrayList<String>();	// incorrect : var can not be used with Generic type
		empName.add("Arun");empName.add("Tarun");empName.add("Purun");empName.add("Murun");
		System.out.println("Iteration Using Lambda...");
		empName.stream().forEach(n->System.out.println(n));
		
		System.out.println("*********");
		
		var roomNo = new ArrayList<Integer>();			// Correct
		roomNo.add(111);roomNo.add(112);roomNo.add(117);
		System.out.println("Room No : "+roomNo);
		
		System.out.println("*********");
		
		var values = new ArrayList<String>();
		values.add("Simant");
		values.add("Muni");
		values.add("Sagar");
		values.removeIf((var n)->n.equals("Sagar"));
		System.out.println(values);
		
		System.out.println("*********");
		var emp = new com.java.pojo.Employee();
		com.java.pojo.Employee e =null;
		var emp2 = e;
		

	}

}
