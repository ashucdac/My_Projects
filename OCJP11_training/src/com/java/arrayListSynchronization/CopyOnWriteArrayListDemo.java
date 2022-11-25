package com.java.arrayListSynchronization;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("Hello");list.add("Masakkali");
		synchronized (list) {
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
}
