package com.java.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()>o2.length()) {
			return 1;
		}else if(o1.length()<o2.length()) {
			return -1;
		}else {
			return 0;
		}
	}
}

public class ArrayListSortingDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Manika");
		list.add("Vijay");
		list.add("Ajay");

		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		Collections.sort(list, new MyComparator());
		System.out.println(list);
		

	}

}
