package com.koitt.java.delivery;

/*
 * 중국집
 */
public class Chinese extends Process{

	@Override
	public void ordering() {
		System.out.println("중국집에서 주문을 받는다");
		
	}

	@Override
	public void cooking() {
		System.out.println("중국집에서 요리를 한다");
	}

	@Override
	public void delivering() {
		System.out.println("중국집에서 배달한다");
	}

	@Override
	public void payment() {
		System.out.println("중국집 배달원 결제한다");
	}

}
