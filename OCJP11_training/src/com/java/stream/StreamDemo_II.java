package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.pojo.Employee;

public class StreamDemo_II {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Vijay", "India", 25);
		Employee e2 = new Employee(103, "Ajay", "India", 29);
		Employee e3 = new Employee(102, "Tijo", "England", 41);
		Employee e4 = new Employee(104, "Kzushki", "Itally", 65);

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		System.out.println("****");
		List l = list.stream().filter(x -> x.getEmpId() < 104).filter(x -> x.getAge() < 40)
				.collect(Collectors.toList());
		System.out.println(l);

		System.out.println("****");
		list.stream().filter(x -> x.getAge() > 25).forEach(System.out::println);

		System.out.println("****");
		list.stream().forEach(System.out::println);

		System.out.println("****");
		list.parallelStream().forEach(System.out::println);

		System.out.println("**** Get the Second largest age");
		Stream<Employee> sortedAgeEmployees = list.stream()
				.sorted(Comparator.comparingInt(Employee::getAge).reversed());
		List<Employee> sortedAgeList = sortedAgeEmployees.collect(Collectors.toList());
		System.out.println(sortedAgeList.get(1));

		System.out.println("**** Chane int array into list");
		int[] arr = { 1, 2, 9, 7, 6, 5 };
		List<Integer> arrlist = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Long lo = arrlist.stream().filter(i -> i % 2 != 0).mapToInt(j -> j * 2).mapToLong(j -> j).sum();
		System.out.println("Long : " + lo);
	}

}
