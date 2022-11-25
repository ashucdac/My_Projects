package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.pojo.Student;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 9, 7);
		long count = numbers.stream().count();
		System.out.println("Count of the list elements : "+count);
		
		List<Integer> square = numbers.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println("Square of the List "+square);
		long mul3Sum = numbers.stream().mapToLong(i->i*3+3).sum();
		System.out.println("Multiply and ADD All the elements with 3 and Add them together " + mul3Sum);
		
		System.out.println("Sum of even numbers of List " + numbers.stream().filter(i->i%2==0).mapToInt(j->j).sum());
		
		System.out.println("Square each number and print **");
		numbers.stream().map(i->i*i).forEach(y->System.out.println(y));
		
		List<String> names = Arrays.asList("Manikarnika", "Abhilasha", "Jyotsima", "Mrinalini");
		
		List<?> result11 = names.stream().filter(i-> !i.startsWith("A")).map(i->i.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("Uppercase the string which are not starting with 'A' *** "+result11);
		
		// Alphabetical Shorting
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Default sorting (alphabetical order) "+sortedNames);
		// **** Sorting on length
		List<String> sortedNameOnLength = names.stream().sorted((s1, s2) -> s1.length() - s2.length()).collect(Collectors.toList());
		System.out.println("Sorted List Based on Length : "+sortedNameOnLength);
		
		
		
		System.out.println("Skip 1"+names.stream().skip(1).collect(Collectors.toList()));
		
		List<Integer> numberList = Arrays.asList(3,1,2,10,14,18,16,17,15,9,23);
		List<Integer> moreThan10 = numberList.stream().sorted().filter(i->i>10).collect(Collectors.toList());
		System.out.println("Numbers Greater than 10 " + moreThan10);
		int sum = numberList.stream().filter(i->i>10).mapToInt(j->j).sum();
		System.out.println("Sum of numbers greater than 10 " + sum);
		int [] arr = {1,2,9,7,6,5};
		List<Integer> arrlist = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Long lo = arrlist.stream().filter(i->i%2!=0).mapToInt(j->j*2).mapToLong(j->j).sum();
		System.out.println("Long : "+lo);
		
		System.out.println("*****Using reduce() method Sum of list****");
		int moreThan_10 = numberList.stream().filter(i->i>10).reduce(0, (subtotal, element)->subtotal+element);
		System.out.println("Sum of moreThan_10 " + moreThan_10);
		int sumOfEven = numberList.stream().filter(i->i%2==0).reduce(0, (subtotal, element)->subtotal+element);
		System.out.println("Sum of even nos " + sumOfEven);
		int sumOfAllElements = numberList.stream().reduce(0, (subtotal, element)->subtotal+element);
		System.out.println("Sum of All elements "+sumOfAllElements);
		
		
		System.out.println("*****Using distinct() method - To get only Unique data****");
		List<Integer> randomNumbers = Arrays.asList(3,1,2,10,14,22,14,23,18,16,17,15,9,23);
		
		List<Integer> noDuplicateList = randomNumbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Elments :" + noDuplicateList);
		
		System.out.println("*****Sorting on User Defined Class attribute****");
		Student s1 = new Student(103, "Raju");
		Student s2 = new Student(101, "Ramesh");
		Student s3 = new Student(102, "Anagha");
		
		List<Student> list = Arrays.asList(s1,s2,s3);
		Stream<Student> listObjectShortOnId = list.stream().sorted(Comparator.comparingInt(Student::getStudentId));
		System.out.println(listObjectShortOnId.collect(Collectors.toList()));
		
		Stream<Student> listObjectShortOnName = list.stream().sorted(Comparator.comparing(Student::getStudentName));
		System.out.println(listObjectShortOnName.collect(Collectors.toList()));
		
		Stream<Student> descendingOrderOfId = list.stream().sorted(Comparator.comparingInt(Student::getStudentId).reversed());
		System.out.println(descendingOrderOfId.collect(Collectors.toList()));
		
		System.out.println("****Defining Our Own Shorting Order");
		Stream<Student> OwnSortingOrder = list.stream().sorted((o1, o2) -> {
			if(((Student) o1).getStudentId() > ((Student) o2).getStudentId()) {
				return -1;
			}else if(((Student) o1).getStudentId() < ((Student) o2).getStudentId()) {
				return 1;
			}else {
				return 0;
			}
		});
		System.out.println(OwnSortingOrder.collect(Collectors.toList()));
		
		System.out.println("****Defining Our Own Shorting Order and using separate logic");
		Comparator<Student> customComparator = new Comparator<Student>() {
		    @Override
		    public int compare(Student o1, Student o2) {
		        if(o1.getStudentId() == o2.getStudentId())
		            return o1.getStudentName().compareTo(o2.getStudentName());
		        else if(o1.getStudentId() > o2.getStudentId())
		            return 1;
		        else return -1;
		    }
		};
		
		System.out.println(list.stream().sorted(customComparator).collect(Collectors.toList()));
		
		
		String intro = "Hello My Name is Ashutosh Tiwari, and I am a Software Engineer";
		
	}

}
