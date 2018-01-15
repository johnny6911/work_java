package com.koitt.java.exception02;

import java.util.ArrayList;
import java.util.List;

/*
 * DAO (Data Access Object): 실제 데이터에 접근하는 객체를 위한 클래스
 * insert(Person p): 사람 객체를 저장
 * readAll(): 저장된 사람 전체 리스트를 가져오기 
 */

//저장된 데이터를 가져오거나 구현하는 기능이 DAO
public class PersonDao {
	List<Person> list; // DB 대신에 사용자를 저장할 자료구조
	
	public PersonDao() {
		this.list = new ArrayList<Person>();
		
	}
	
	public void insert(Person p) {
		this.list.add(p);
	}
	
	public List<Person> readAll(){
		return this.list;
	}
	
	public List<Person> selectAll(){
		return this.list;
	}
	
}
