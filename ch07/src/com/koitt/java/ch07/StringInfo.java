package com.koitt.java.ch07;

public class StringInfo {
	public static void main(String[] args) {
		String snum = "20123458";
		
		// 생성자 오버로딩이용
		String name = new String("김경석"); // 객체생성하는것
		String dept = new String(new char[] {'컴', '퓨', '터', '학', '과'});
		String java = new String("java");
		
		System.out.printf("%d ", snum.compareTo("20123458")); // 다른게 없기때문에 0이 출려됨
		System.out.printf("%d %n", snum.compareTo("20123456"));	// 8이라는 문자값과 6이라는 문자값을 뺏더니 2가 출력됨
		System.out.printf("%s ", name);						// 김경석 출력
		System.out.printf("%s ", name.replace('김', '강')); // 강으로 바꿔서 출력함
		System.out.printf("%s %n", name); 					//김경석 출력
		System.out.printf("%s ", dept);
		System.out.printf("%s ", dept.substring(0, 3));		//0 컴(1) 퓨(2) 터(3) 학(4) 과(5) 문자 사이로 숫자를 세면된다
		System.out.printf("%d %n", dept.length());			//dept 의 길이는 5
		System.out.printf("%s ", java.indexOf('a'));		//j(0)a(1)va
		System.out.printf("%s ", java.concat(" language"));	// language를 뒤에다 붙인것 일시적으로 리턴한것
		System.out.printf("%s ", java.replace('j', 'J'));	// 첫글자 j를 대문자 J로 바꾸라는것
		System.out.printf("%s ", java.toUpperCase());		// 전체를 대문자로 바꾸는것
		System.out.printf("%b ", java.equals("JAVA"));		// java와 JAVA를 비교하는것 불일치하므로 false
		System.out.printf("%s ", java.equalsIgnoreCase("JAVA"));	//대소문자 구별하지말고 JAVA와 java를 비교하라는것 같으므로 true
		System.out.printf("%s %n", java.substring(1)); 		// j와 a 사이가 1이므로 1부터 출력되므로 ava가 나옴
		System.out.println(dept);
		
	}
}
