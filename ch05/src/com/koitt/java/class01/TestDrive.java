package com.koitt.java.class01;

public class TestDrive {

	public static void main(String[] args) {

		// 강사 sanghoon 생성 - Teacher 클래스의 객체를 생성
		/*
		 * 
		 * teacher()는 기본 생성자를 호출한 것이다
		 */
		Teacher sanghoon = new Teacher(); // ()에 기본생성자를 사용하는중
		Teacher changmok = new Teacher("수학");
		Teacher gildong  = new Teacher("국어", 3);
		Teacher hyosun = new Teacher("과학", 10, "효선 과학부");
		
		

		// 강사 sanghoon 정보 입력
		sanghoon.setAddress("상도동");
		sanghoon.setAge(32);
		sanghoon.setGender("남");
		sanghoon.setGroup("한국아이티인재개발학원");
		sanghoon.setName("정상훈"); // 정상훈이란 값을 메소드의 아규먼트에 집어넣는다
		sanghoon.setSsn("861201");
		sanghoon.setSubject("프로그래밍");
		sanghoon.setYear(1);

		// Person의 print() 메소드 호출
		sanghoon.print();			//Person의 print() 메소드 호출
		sanghoon.print();	//Teacher의 printTeacher() 메소드 호출
		
		// 학생 taehyun 생성 - Student 클래스의 객체(Object)를 생성
		Student taehyun = new Student();

		// 학생 taehyun의 정보 입력
		taehyun.setAddress("서울");
		taehyun.setAge(42);
		taehyun.setGender("남");
		taehyun.setGrade(4);
		taehyun.setMajor("연기과");
		taehyun.setName("차태현");
		taehyun.setSsn("760325");
		taehyun.setStudentId(10);

		// 강사 sanghoon의 이름을 변경
		sanghoon.setName("홍길동");

		// 학생 taehyun의 나이를 변경
		taehyun.setAge(29);

		// 강사 sanghoon 객체의 정보를 출력
		System.out.println("=== 강사 sanghoon 객체 정보 ===");
		System.out.println(sanghoon.getAddress());
		System.out.println(sanghoon.getGroup());
		System.out.println(sanghoon.getName());

		// 학생 taehyun 객체의 정보를 출력
		System.out.println("=== 학생 taehyun 객체 정보 ===");
		System.out.println(taehyun.getGrade());
		System.out.println(taehyun.getMajor());
		System.out.println(taehyun.getAge());
		
		// (default)접근제한자로 변경 시 발생하는 문제
		// 필드에 바로 접근해서 바꿨기때문에 바꿀수 있다. 자바의 객체지향에 위배가 됨
		//sanghoon.ssn = "801201";
		//System.out.println("주민등록번호 날조: " + sanghoon.ssn);
		
		//외부에서 날조를 예방하는 방법
		//이렇게 사용하는게 기본적이다
		sanghoon.setSsn("801201");
		System.out.println("주민등록번호 날조: " + sanghoon.getSsn());

	}
}
