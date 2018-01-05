package com.koitt.java.delivery;

public class Pizza extends Process{

	@Override
	public void ordering() {
		System.out.println("피자 주문을 받는다");
	}

	@Override
	public void cooking() {
		System.out.println("피자를 만든다");
	}

	@Override
	public void delivering() {
		System.out.println("피자집에서 배달한다");
	}

	@Override
	public void payment() {
		System.out.println("피자집 배달원이 결제를 받는다");
	}
	
}
