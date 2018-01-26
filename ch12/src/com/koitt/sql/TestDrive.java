package com.koitt.sql;

public class TestDrive {
	
	static {
		/*
		 * TestDrive 클래스는 main 메소드를 포함하고 있는데
		 * Java 가상머신(VM)이 main 부터 실행을 위해
		 * TestDrive 클래스 정보를 메모리에 올려야 하기 떄문에 static 블록이 실행
		 */
		System.out.println("TestDrive static block 실행 ...");
	}
	
	public static void main(String[] args) throws ClassNotFoundException{
/*		Class.forName("com.koitt.sql.ExStaticBlock");*/
		new ExStaticBlock();
		new ExStaticBlock();
		new ExStaticBlock("테스트");
	}
}
