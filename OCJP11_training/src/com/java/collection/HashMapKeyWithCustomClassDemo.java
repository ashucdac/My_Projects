package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.java.pojo.Student;

public class HashMapKeyWithCustomClassDemo {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Raju");
		Student s2 = new Student(101, "Raju");
		Student s3 = new Student(101, "Raju");
		HashMap<Student, String> mapObj = new HashMap<Student, String>();
		
		mapObj.put(s1, "India");
		mapObj.put(s2, "Japan");
		mapObj.put(s3, "CheckRepublic");
		
		s3.setStudentId(103);
		System.out.println(mapObj.get(s3));
		
		for(Map.Entry<Student, String> entry : mapObj.entrySet()) {
			System.out.println(entry.getKey() + "===" + entry.getValue());
		}

	}

}
