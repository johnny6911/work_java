package com.koitt.java.ch07.javabean;

public class Student {
	private int studentId;
	private String name;
	
	public Student() {
		
	}
	
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.studentId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		// obj가 현재 클래스를 상속받고 있는지 확인
		// 
		if (!(obj instanceof Student)) {
			return false;
		}
		
		Student j = (Student) obj; // 스튜던트 타입으로 다운캐스팅
		if (this.studentId == j.studentId) { //
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentId=");
		builder.append(studentId);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		Student s = new Student(10000, "고길동");
		Student s2 = new Student(10000, "홍길동");
		
		if(s.equals(s2)) {
			System.out.println("두 사람은 같은 사람입니다");
		}
		else {
			System.out.println("두 사람은 다른 사람입니다");
		}
	}
}
