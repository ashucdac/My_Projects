package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.java.pojo.Employee;

public class ConvertingListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(101, "Indonesia", "Jabusky", 26);
		Employee e2 = new Employee(102, "Japan", "Xin", 66);
		Employee e3 = new Employee(103, "India", "Ajay", 23);
		Employee e4 = new Employee(103, "India", "Ajay", 23);
		
		al.add(e1);al.add(e2);al.add(e3);al.add(e4);
		List bl = al.stream().distinct().collect(Collectors.toList());
		System.out.println(bl);
		
		HashSet<Employee> hSet = new HashSet<Employee>(al);
		
		System.out.println(hSet);
		
		

	}

}
