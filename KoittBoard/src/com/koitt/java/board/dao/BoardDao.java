package com.koitt.java.board.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.koitt.java.board.exception.BoardException;
import com.koitt.java.board.model.Board;
import com.koitt.java.util.DBManager;

public class BoardDao {

	// 데이터베이스 대신 게시글을 저장하는 용도로 사용
	/*public static final String FILE_NAME = "board-list.dat";*/

	/*List<Board> list;*/

	public BoardDao() {/*
		try {
			this.list = DBManager.getInstance().selectAll();
		} catch (SQLException e) {
			System.out.println("selectAll() BoardDao에서 오류");
		} */
				/*loadFromFile(BoardDao.FILE_NAME); //게시글 전체목록을 가지고있음
*/	}
	
										// 2.
	public void insert(Board board) throws BoardException, SQLException {
		DBManager.getInstance().insert(board);
	}

	// 1.
	public List<Board> selectAll() throws SQLException {
		return DBManager.getInstance().selectAll(); //결과를 리스트로 바꿔서 그대로 쿼리문까지 전달하는것
	}

	// 1.							// 2.
	public void delete(Board board) throws BoardException, SQLException {
		
		DBManager.getInstance().delete(board);
		// 1.
		throw new BoardException("E02: 삭제할 게시글이 존재하지 않습니다.");
	}

	// 1.							// 2.
	public void update(Board board) throws BoardException, SQLException {
		/*for (Board item : this.list) {
			if (item.equals(board)) {
				
				 * id: 검색 조건이기 때문에 변경 필요 없음
				 * writer: 기존 작성한 작성자와 동일하다고 가정해서 변경 필요 없음
				 * regDate: 글 생성일이기 때문에 일자를 변경 필요 없음
				 
				item.setContent(board.getContent());
				item.setTitle(board.getTitle());
				item.setModiDate(board.getModiDate());
				// TODO 5. saveTOFile(list, [파일명]);
				return;
			}
		}
		
*/		// 1.
		DBManager.getInstance().delete(board);
		
	}

	// 1. 해당 글이 존재하는지 여부 확인 메소드
	public boolean isExist(Board board) {
		return false;	// 다 찾아봤는데 없어서 false 리턴
	}

	public void saveToFile(List<Board> list, String filename) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(list);

			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private List<Board> loadFromFile(String filename){
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object list = null;


		try {
			File file = new File(filename);

			if (file.exists()) {
				fis = new FileInputStream(filename);
				ois = new ObjectInputStream(fis);

				list = ois.readObject();

				ois.close();
				fis.close();

				return (List<Board>) list;	
			}
			else {
				System.out.println("어서오십시오.");
				return new ArrayList<Board>();
			} 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
/*
 * TODO 1. saveToFile(List<Board> list, String filename)
 * list: BoardDao에 있는 list 필드
 * filename: list 객체를 저장할 파일 이름
 */

/*
 * TODO 2. provate List<Board> loadFromFile(String filename)
 * filename: 게시글 리스트가 저장된 파일명
 * 
 * List<Board> : 파일에서 불러온 list 객체를 리턴
 */

