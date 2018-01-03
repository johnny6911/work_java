package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {

	public static void main(String[] args) {
		//자동차 생성
		//주인이 소유한 차를 소개하는 메소드를 호출
		Car vera = new Car("베라쿠르즈");
		vera.setMaxSpeed(180);
		Owner sungEun = new Owner("성은", vera);
		sungEun.introCar();
		
		Car k5 = new Car("K5");
		k5.setMaxSpeed(170);
		Owner yeoPo = new Owner("여포", k5);
		yeoPo.introCar();
	}
}
