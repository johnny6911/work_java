package com.koitt.java.ch07;

import java.util.ArrayList;

public class MyContainer<E> { // E의 자리는 전부 String으로 바뀐다
	private ArrayList<E> list;
	
	public MyContainer() {
		list = new ArrayList<E>();
	}
	public E get(int index) {
		return list.get(index);
	}
	public void add(E element) {
		list.add(element);
	}
	
	public static void main(String[] args) {
		MyContainer<String> pl = new MyContainer<String>();
		pl.add("algol");
		pl.add("C");
		//pl.add(5); 오류 발생
		pl.add("java");
		System.out.println(pl.get(0) + " ");
		System.out.println(pl.get(1) + " ");
		System.out.println(pl.get(2) + " ");
	}
}
