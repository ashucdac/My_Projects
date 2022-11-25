package com.java.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.java.pojo.Student;

public class TreeMapWithCustomKeyClass {

	public static void main(String[] args) {
		TreeMap<Student, String> treeObj = new TreeMap<Student, String>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getStudentName().compareTo(o2.getStudentName());
			}
		});
		Student s1 = new Student(101, "Raju");
		Student s2 = new Student(101, "Raju");
		Student s3 = new Student(101, "Raju");
		Student s4 = new Student(102, "Arun");
		Student s5 = new Student(103, "Tarun");
		Student s6 = new Student(104, "Purun");

		treeObj.put(s1, "India");
		treeObj.put(s2, "Japan");
		treeObj.put(s3, "Korea");
		treeObj.put(s4, "CheckRepublic");
		treeObj.put(s5, "Israil");
		treeObj.put(s6, "Russia");
		
		for (Map.Entry<Student, String> entry : treeObj.entrySet()) {
			System.out.println(entry.getKey() + "===" + entry.getValue());
		}
		
		System.out.println("****************** Get Ascending Order");
		TreeMap<Student, String> treeObj2 = new TreeMap<Student, String>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getStudentId()-o2.getStudentId();
			}
		});
//		System.out.println("****************** Get Descending Order");
//		TreeMap<Student, String> treeObj2 = new TreeMap<Student, String>(new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				if (o1.getStudentId()>o2.getStudentId()) {
//				return -1;	
//				}else if(o1.getStudentId()<o2.getStudentId()) {
//					return 1;
//				}else {
//					return o1.getStudentId()-o2.getStudentId();
//				}
//			}
//		});
		
		Student a1 = new Student(101, "Raju");
		Student a2 = new Student(101, "Raju");
		Student a3 = new Student(101, "Raju");
		Student a4 = new Student(102, "Arun");
		Student a5 = new Student(103, "Tarun");
		Student a6 = new Student(104, "Purun");

		treeObj2.put(a1, "India");
		treeObj2.put(a2, "Japan");
		treeObj2.put(a3, "Korea");
		treeObj2.put(a4, "CheckRepublic");
		treeObj2.put(a5, "Israil");
		treeObj2.put(a6, "Russia");
		
		for (Map.Entry<Student, String> entry : treeObj2.entrySet()) {
			System.out.println(entry.getKey() + "===" + entry.getValue());
		}

	}

}
