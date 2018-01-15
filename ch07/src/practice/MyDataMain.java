package practice;

import java.util.Scanner;

public class MyDataMain {
	public static void main(String[] args) {
		MyData<String, String, String> myData = new MyData<>();
		myData.put("파닥몬", "KT", "010-3196-3985");
		myData.put("아구몬", "SKT", "010-4000-4000");
		
		System.out.println("검색할 이름을 적으세요 >> ");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		myData.search(name);
		input.close();
	}
}
