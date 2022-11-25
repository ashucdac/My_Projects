package com.java.collection;

import java.util.HashSet;

import com.java.pojo.Student;

public class HashSetKeyWithUserDefinedClass {

	public static void main(String[] args) {
		
		HashSet<Student> setObj = new HashSet<Student>();
		
		Student s1 = new Student(101, "Raju");
		Student s2 = new Student(101, "Raju");
		Student s3 = new Student(101, "Raju");
		
		setObj.add(s1);setObj.add(s2);setObj.add(s3);
		
		System.out.println(setObj);

	}

}
