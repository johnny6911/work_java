package com.koitt.sql;

public class ExStaticBlock {
	
	static int staticnum = 20;
	int num = 10;
	
	// static block
	static {
		System.out.println("static block activated: " + ExStaticBlock.staticnum);
	}
	
	/*
	 *  instance block: 생성자보다 먼저 실행이 되며
	 *  	여러 생성자의 공통적인 코드부분을 instance block에 구현하면
	 *  	편리하다.
	 */
	{
		System.out.print("instance block 실행: ");
		System.out.print(ExStaticBlock.staticnum + " / ");
		System.out.println(this.num);
	}
	
	//기본생성자
	public ExStaticBlock() {
		System.out.println("기본 생성자 실행: " + this.num);
	}
	
	public ExStaticBlock(String test) {
		System.out.println("ExStaticBlock(String test) 실행");
	}
	
	public static void main(String[] args) {
		/*try {
			// static 키워드가 붙은 항목들이 실행
			Class.forName("com.koitt.sql.ExStaticBlock");
			
			// 객체 생성 - 기본생성자 호출
			ExStaticBlock block = new ExStaticBlock();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
	}
}
