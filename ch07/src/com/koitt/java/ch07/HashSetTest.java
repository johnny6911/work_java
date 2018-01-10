package com.koitt.java.ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<Integer>(); //객체 만듬 , 권장사항
		Set<Integer> setB = new HashSet<Integer>();
		
		setA.add(3); 
		setA.add(5); 
		setA.add(7); //set의 특징은 중복된걸 넣을수 없음, 중복되지 않게 저장이 됨
		setA.add(8); 
		setA.add(7); 
		setA.add(9);
		System.out.print("A = ");
		print(setA);
		// println에서 자동으로 Argument로 전달받은 객체의 toString 메소드를 호출한다
		System.out.println(" A = " + setA.toString()); // setA에 있는 toString()을 자동으로(투 스트링이 없어도) 호출해준다
		
		setB.add(5); 
		setB.add(3);	
		setB.add(2);
		System.out.print("B = ");
		print(setB);
		System.out.println(" B = " + setB);
		
		boolean isChanged = setA.removeAll(setB); //바뀐게 있으므로 true값이 리턴되어 setA에서 setB에 있는 모든것을 뺀것이 출력됨
		System.out.print("A - B = ");
		if(isChanged) {
			System.out.println(setA);;
		}
		
		// for - each문
		System.out.print("for-each문으로 출력: "); // setA의 3, 5를 뺀후 출력된것
		for(Integer i : setA) {
			System.out.print(i + " ");
		}
	}
	public static void print(Set<Integer> setA) {
		Iterator<Integer> i = setA.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");	
		}
	}
}
