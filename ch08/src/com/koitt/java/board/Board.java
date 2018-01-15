package com.koitt.java.board;

import java.util.Date;

public class Board {
	private int id;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	
	public Board(int id, String title, String content, 
			String writer, Date regDate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Board)) {
			return false;
		}
		
		Board p = (Board)obj;
		if(this.id == p.id) {
			return true;
		}
		
		return false;
	}
}
