package com.java.arrayListSynchronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("Practice");list.add("Code");list.add("quiz");
		
		//this is to lock any object for any shared resource
		synchronized (list) {
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}

	}

}
