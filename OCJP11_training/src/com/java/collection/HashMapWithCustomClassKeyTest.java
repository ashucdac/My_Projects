package com.java.collection;

import java.util.HashMap;
import java.util.Map;

import com.java.pojo.Student;

public class HashMapWithCustomClassKeyTest {

	public static void main(String[] args) {

		HashMap<Student, String> mapObj = new HashMap<Student, String>();

		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("Raju");

		mapObj.put(s1, "India");

		Student s2 = new Student();
		s2.setStudentId(101);
		s2.setStudentName("Raju");

		mapObj.put(s2, "Japan");

//		s2.setStudentId(102);
		System.out.println(mapObj.get(s2));
		for (Map.Entry<Student, String> entry : mapObj.entrySet()) {
			System.out.println(entry.getKey() + "===" + entry.getValue());
		}

	}

}
