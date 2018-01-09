package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(0.87);
		list.add("algol");
		list.add("pascal");
		list.add(null);
		list.add(1);
		list.add("java");
		list.add(3.4);
		list.add(5.8);
		
		Iterator it = list.iterator();
		print(it); // ctrl + 1
		
		for(Object e : list.toArray()) { //2번째는 for문을 이용해 출력한것
			System.out.print(e + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) { 
			Object e = list.get(i);
			System.out.print(e + " ");
		}
	}

	private static void print(Iterator it) { //1번째는 Iterator로 출력한것
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
	}
}
