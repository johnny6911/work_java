package com.koitt.java.exception02;

import java.util.List;

public class PersonService {

	private PersonDao dao;
	
	public PersonService() {
		this.dao = new PersonDao();
	}
	//사람 받아서 dao를 이용해서 간략하게 받아온것
	public void add(Person p) throws MyException {
		dao.insert(p);
	}
	
	public List<Person> read(){
		return dao.selectAll();
	}
	
	public void remove(Person p) throws MyException{
		dao.delete(p);
	}
	
	public void modify(Person p) throws MyException {
		dao.update(p);
	}
}
