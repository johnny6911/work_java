package com.koitt.java.exception02;

import java.util.List;

public class PersonService {

	private PersonDao dao;
	
	public PersonService() {
		this.dao = new PersonDao();
	}
	//사람 받아서 dao를 이용해서 간략하게 받아온것
	public void add(Person p) {
		dao.insert(p);
	}
	
	public List<Person> read(){
		return dao.selectAll();
	}
}
