package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {

	public static void main(String[] args) {
		//자동차 생성 작성순서 질문
		//주인이 소유한 차를 소개하는 메소드를 호출
		Car vera[] = new Car[1];
		vera[0] = new Car("베라쿠르즈", 180);
		//vera.setMaxSpeed(180);
		Owner sungEun = new Owner("성은", vera);
		sungEun.introCar();
		
		//자동차 배열을 생성한다.
		Car[] car3 = new Car[3];
		car3[0] = new Car("k3", 180); //자동차 배열들에 차를 집어 넣는다
		car3[1] = new Car("k5", 185);
		car3[2] = new Car("qm6", 180);
		//k5.setMaxSpeed(170);
		Owner yeoPo = new Owner("여포", car3);
		yeoPo.introCar();
		
		//차량 한대 생성
		Car mazda[] = new Car[2];
		mazda[0] = new Car("마즈다", 180);
		mazda[1] = new Car("마즈다 익스페디션", 200);
		
		yeoPo.setCar1(mazda);
		yeoPo.introCar();
		
		yeoPo.setCar1(car3);
		yeoPo.introCar();
	}
}
