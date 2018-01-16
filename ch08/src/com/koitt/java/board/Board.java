package com.koitt.java.board;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
	private int id;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	
	public Board() {
		
	}
	
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
		
		Board b = (Board)obj;
		if(this.id == b.id) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.title.hashCode() + this.content.hashCode() + this.writer.hashCode() +
				this.regDate.hashCode() + this.id;
		
	}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", content=");
		builder.append(content);
		builder.append(", writer=");
		builder.append(writer);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append("]");
		return builder.toString();
	}
	
}
