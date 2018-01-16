package com.koitt.java.board;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.koitt.java.exception02.Person;

public class BoardDao {
	//1 
	List<Board> list; // DB 대신에 사용자를 저장하는 용도로 사
	
	public BoardDao() {
		this.list = new ArrayList<Board>();
	}
	
	//2
	public void insert(Board b) throws MyException{
		for(Board item : this.list) {
			if(item.equals(b)) {
				throw new MyException("Err! - 게시글이 중복되었습니다");
			}
		}
		this.list.add(b);
	}
	
	//3
	public List<Board> readAll(){
		return this.list;
	}
	//전체 목록 가져오기
	public List<Board> selectAll(){
		return this.list;
	}
	
	// 4 Argument(인자)로 전달받은 객체를 list에서 제거
	public void delete(Board b) throws MyException{ // 지우고싶은 객체 입력
		for (int i = 0; i < this.list.size(); i++) {
			if(this.list.get(i).equals(b)) {
				this.list.remove(i);
				return;
			}
		}
		
		throw new MyException("Err! - 삭제할 게시글 정보가 없습니다.");
	}
	
	public void update(Board b) throws MyException{
		for (Board item : this.list) {
			if (item.equals(b)) {
				item.setTitle(b.getTitle());
				item.setContent(b.getContent());
				return;
			}
		}
		
		throw new MyException("Err! - 게시글을 찾을수 없습니다.");
	}
	
	//1. 해당 글이 존재하는지 여부 확인 메소드
	public boolean isExist(Board b) {
		for (Board item: this.list) {
			if(item.equals(b)) {
				return true;	// 글이 존재할 경우 존재한다고 리턴
			}
		}
		return false;
	}
}
