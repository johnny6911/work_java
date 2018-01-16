package com.koitt.java.board;

import java.util.Date;
import java.util.List;

public class BoardService {
	
	private int count;
	
	//1
	private BoardDao dao;
	
	public BoardService() {
		this.dao = new BoardDao();
		this.count = 0; // 0으로 초기화
	}//
	
	//2 컨트롤러에서 객체 b를 서비스 클래스로 전달받음
	public void add(Board b)  throws MyException{
		b.setId(++count); //초기값이 0이기에 1부터 들어가게 하기위에 ++을 앞에 해준다
		b.setRegDate(new Date());
		dao.insert(b);		// 자료구조(ArrayList)에 저장하기 위해 dao에 b객체를 전달한다
	}
	
	public List<Board> read(){
		return dao.selectAll();
	}
	//3
	public void remove(Board b) throws MyException {
		dao.delete(b);
	}
	
	public void modify(Board b) throws MyException {
		dao.update(b);
	}
	
	public boolean isExist(Board b) {
		return dao.isExist(b);
	}
}
