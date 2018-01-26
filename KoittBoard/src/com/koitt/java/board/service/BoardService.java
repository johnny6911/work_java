package com.koitt.java.board.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.koitt.java.board.dao.BoardDao;
import com.koitt.java.board.exception.BoardException;
import com.koitt.java.board.model.Board;

public class BoardService {
	
	private BoardDao dao;
	
	public BoardService() {
		this.dao = new BoardDao();
	}
	
								// 3.
	public void add(Board board) throws BoardException, SQLException {
		this.dao.insert(board);			// 자료구조(ArrayList)에 저장하기 위해 dao로 board 객체를 전달
	}
	
	// 2.
	public List<Board> read() throws SQLException {
		return dao.selectAll();
	}
	
	// 2.							// 3.
	public void remove(Board board) throws BoardException {
		dao.delete(board);
	}
	
	// 2.							// 3.
	public void modify(Board board) throws BoardException {
		board.setModiDate(new Date());	// 9.
		dao.update(board);
	}
	
	// 2.
	public boolean isExist(Board board) {
		return dao.isExist(board);
	}
	
}
