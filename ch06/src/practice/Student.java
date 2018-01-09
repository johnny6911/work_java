package practice;

import java.util.Scanner;

public class Student extends Person {
	String schoolName;
	String dept;
	String studentId;
	double[] avgScore;
	
	public Student(String name, int age, String address, String schoolName, 
			String dept, String studentId) {
		super(name, age, address);
		this.schoolName = schoolName;
		this.dept = dept;
		this.studentId = studentId;
		this.avgScore = new double[8];
	}
	
	public double average() {
		double sum = 0;
		for (int i = 0; i < avgScore.length; i++) {
			sum += avgScore[i];
		}
		return sum / avgScore.length;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("김다정", 20, "서울시 관악구", "동양서울대학교", "전산정보학과", "20132222");
		
		System.out.println("이름 : " + s1.name);
		System.out.println("나이 : " + s1.age);
		System.out.println("주소 : " + s1.address);
		System.out.println("학교 : " + s1.schoolName);
		System.out.println("학과 : " + s1.dept);
		System.out.println("학번 : " + s1.studentId);
		
		System.out.println("--------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("8학기 학점을 순서대로 입력하세요");
		
		for (int i = 0; i < s1.avgScore.length; i++) {
			System.out.print((i + 1) + "학기 학점 -> ");
			s1.avgScore[i] = scanner.nextDouble();
		}
		
		System.out.println("--------------------------");
		
		System.out.println(s1.avgScore.length + "학기 총 평균 평점은 " 
			+ s1.average() + "점입니다");
	}
}
