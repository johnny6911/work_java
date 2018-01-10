package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyMap<K, V> { //배열에다가 제네릭 못씀
	private Set<K> keySet; 		// key 값들을 저장하는 Set, key를 모아둔 set
	private List<K> keys; 			// key값을 저장하는 배열
	private List<V> values;			// value값을 저장하는 배열
	private int size; 			// 데이터의 개수
	
	//생성자
	public MyMap() { // 배열관리는 어레이리스트에서 해줄거임
		keySet = new HashSet<K>();
		keys = new ArrayList<K>();
		values = new ArrayList<V>();
	}
	
	public void put(K key, V value) {
		for (int i = 0; i < keys.size(); i++) {
			// 이 조건이 맞으면 해당 key의 value를 수정
			if (keys.get(i).equals(key)) {
				values.set(i, value);
				return; // void 타입이기에 return;만 써줌
			}
		}
		keySet.add(key);
		keys.add(key);
		values.add(value);
		size += 1; //데이터 하나 들어감
	}
	
	public V get(K key) { //K 타입의 key를 집어넣음
		for (int i = 0; i < keys.size(); i++) {
			if (keys.get(i).equals(key)){
				return values.get(i);	// 같을경우 values의 인덱스값
			}
		}
		
		return null;
	}
	
	public Set<K> getKeySet(){
		return this.keySet; //대한민국, 일본, 중국이 들어가있음
	}
	
	public static void main(String[] args) {
		MyMap<String, String> map = new MyMap<String, String>();
		map.put("대한민국", "서울");
		map.put("일본", "도쿄");
		map.put("중국", "북경");
		map.put("중국", "상하이");
		
		// Map에 저장된 Set(keySet)에서 순차적으로 key값을 가져온다
		for (String key : map.getKeySet()) {
			/*
			 *  순차적으로 가져온 key 값을 이용해서 map의 get 메소드를 이용하여
			 *  실제 value 값을 가져온다
			 */
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
