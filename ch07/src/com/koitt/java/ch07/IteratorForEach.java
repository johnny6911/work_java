package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorForEach {
	
	public static void main(String[] args) {
		// for-each
		List<Integer> array = new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		
		// for - each
		for (int item : array) {
			System.out.println(item);
		}
		
		// for - each문의 원리: iterator
		for (Iterator<Integer> i = array.iterator(); i.hasNext();) {
			Integer item = i.next(); //next하면 값을 가져온다 , 
			System.out.println(item);
		}
	}
}
