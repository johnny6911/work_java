package practice;

import java.util.HashMap;
import java.util.Map;

public class MyData<K, V1, V2> {
	// Map 2개 만들기
	Map<K, V1> telecom;		//키: 이름, 값: 통신사
	Map<K, V2> phoneBook;	//키: 이름, 값: 전화번호
	
	public MyData() {
		this.telecom = new HashMap<K, V1>();
		this.phoneBook = new HashMap<K, V2>();
	}
	
	public void search(String name) {
		V1 t = telecom.get(name);
		V2 p = phoneBook.get(name);
		
		System.out.println("입력하신 " + name + "님의 전화번호는 " + p + ", "
				+ "이동통신사는 " + t + "입니다.");
	}
	
	public void put(K name, V1 telecom, V2 phone) {
		this.telecom.put(name, telecom);
		this.phoneBook.put(name, phone);
	}
}
