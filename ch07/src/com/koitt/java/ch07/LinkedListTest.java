package com.koitt.java.ch07;

import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); //일반적인 객체생성(list)
		
		list.add("pascal");		
		list.addLast(1);		//현재 배열의 제일 마지막에 1을 넣음(pascal1)
		list.add("JAVA");		//JAVA가 추가되기때문에 pascal1JAVA가 됨
		list.addLast(3.4);		//JAVA뒤에 3.4가 붙음
		list.addFirst("algol");	//pascal앞에 algol이 붙
		list.addFirst(0.87);	//algol 앞에 0.87이 붙음
		list.add(3, null);		// 3번째 뒤에 null값을 넣어줌
		list.addLast(5.8);
		
		Iterator it = list.iterator();
		print(it);
		print(list.descendingIterator());
		
		//배열로 반환하여 모든 원소 출력가능
		for ( Object e : list.toArray()) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	public static void print(Iterator it) {
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
}
