package com.java.arrayListSynchronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayListDemo {

	public static void main(String[] args) {
		 List<String> list = Collections.synchronizedList(new ArrayList<String>());
		 list.add("practice");list.add("code");list.add("quiz");
		 synchronized (list) {
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				list.remove(1);					//ConcurrentModificationException
			}
//			 for (String s : list) {
//		          if ("code".equals(s)) {
//		              // NO Exception
//		              list.remove(s);
//		          }
//		          System.out.println(s);
//		      }
		}
		 
		 CopyOnWriteArrayList<String> strList = new CopyOnWriteArrayList<String>();
		 strList.add("Raju");strList.add("Ajay");strList.add("Vijay");
//		 strList.remove(1);
		 // Using Iterator
		 Iterator it = strList.iterator();
		 while (it.hasNext()) {
			System.out.println(it.next());
			strList.remove(it.next());
		}
		 // Using For each loop
//		 for (String s : strList) {
//	          if ("Ajay".equals(s)) {
//	              // No Exception
//	              strList.remove(s);
//	          }
//	      }
//		 System.out.println(strList);

	}

}
