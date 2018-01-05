package com.koitt.java.delivery;

/*
 * 디자인 패턴 - 템플릿 메소드 패턴
 */
public abstract class Process {
	
	// 1. 주문받기
	// 추상 메소드 만들기
	public abstract void ordering();
	
	// 2. 요리하기
	public abstract void cooking();
	
	// 3. 배달하기
	public abstract void delivering();
	
	// 4. 결제하기
	public abstract void payment();
	
	// 순서대로 호출하는 메소드 구현
	public void processing() { //실행하는 순서가 고정적으로 된다
		this.ordering();
		this.cooking();
		this.delivering();
		this.payment();
	}
	
	public static void main(String[] args) {
		  Process chicken = new Chicken();
		  Process chinese = new Chinese();
		  Process pizza = new Pizza();
		  
		  Process[] stores = new Process[3];
		  stores[0] = chicken;
		  stores[1] = chinese;
		  stores[2] = pizza;
		  
		  for(int i = 0; i < stores.length; i++) {
			  stores[i].processing();
		  }
		  
	}
}
