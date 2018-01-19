package com.koitt.java.exception02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * DAO (Data Access Object): 실제 데이터에 접근하는 객체를 위한 클래스
 * insert(Person p): 사람 객체를 저장
 * readAll(): 저장된 사람 전체 리스트를 가져오기 
 */

//저장된 데이터를 가져오거나 구현하는 기능이 DAO
public class PersonDao {
	public static final String FILE_NAME = "person-list.dat"; 
	
	List<Person> list; // DB 대신에 사용자를 저장할 자료구조
	
	public PersonDao() {
		this.list = loadFromFile(PersonDao.FILE_NAME);
		
	}
	
	public void insert(Person p) throws MyException{
		//list에서 중복된 인적정보 찾기
		for (Person item : this.list) {
			// 사람 이름 비교해서 같다면 중복된 사람으로 처리
			if (item.equals(p)) {
				throw new MyException("E01: Person 객체 중복");
			}
		}
		this.list.add(p);
	}
	
	public List<Person> readAll(){
		return this.list;
	}
	
	// 전체 목록 가져오기
	public List<Person> selectAll(){
		return this.list;
	}
	
	// Argument로 전달받은 객체를 list에서 제거
	public void delete(Person p) throws MyException{
		// list에서 Argument로 전달받은 객체의 name과 동일한 객체가 있는지 확인
		/*for (Person item : this.list) {
			if (item.equals(p)) {  //이름이 같으면 삭제한다는것
				list.remove(item); //리스트에 있는 item의 값을 지움
				return; //삭제가 성공했으면 밑에 E02 메세지가 출력되지 않는다
			}
		}*/
		for (int i = 0; i < this.list.size(); i++) {
			if (this.list.get(i).equals(p)) {
				this.list.remove(i);
				return;
			}
		}
		
		throw new MyException("E02: 삭제할 정보가 없습니다.");
	}
	
	public void update(Person p) throws MyException{
		// list에서 Argument로 전달받은 객체의 name과 동일한 객체가 있는지 확인
		for (Person item : this.list) {
			if (item.equals(p)) {	//검색조건이 이름이었기때문에 item과 p는 똑같은 이름이다
				/*item.setName(p.getName());*/ 		//같은 이름이기에 굳이 세팅할 필요가 없다(name을 새로 set할 필요가 없다.)
				item.setAge(p.getAge()); 
				return;	// 찾았으므로 검색을 중단하고 끝낸다.
			}
		}
	
		throw new MyException("E03: 수정할 사람이 없습니다.");
	}
	
	/*
	 * TODO 1. private void saveToFile(List<Person> list, String filename)
	 * list: PersonDao에 있는 list 필드
	 * filename: list 객체를 저장할 파일 이름
	 */
	private void saveToFile(List<Person> list, String filename) {
		// FileOutputStream, ObjectOutputStream
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
	
	/*
	 * TODO 2. private List<Person> loadFromFile(String filename)
	 * filename: 게시글 리스트가 저장된 파일명
	 * 
	 * List<Person> : 파일에서 불러온 list 객체를 리턴
	 */
	private List<Person> loadFromFile(String filename) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object list = null;
		
		try {
			File file = new File(filename);	// 해당 파일 객체화
			
			// 파일이 존재 할 경우
			if (file.exists()) {
				fis = new FileInputStream(filename);
				ois = new ObjectInputStream(fis);

				// 파일에 있던 리스트 객체를 끄집어내기
				list = ois.readObject();

				ois.close();
				fis.close();
				
				return (List<Person>) list;
			}
			else {
				System.out.println("처음 방문입니다.");
				return new ArrayList<Person>();
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
