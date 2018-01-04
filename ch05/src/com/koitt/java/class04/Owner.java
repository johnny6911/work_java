package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {

		private String name; // 내 이름
		private Car[] car1;	// 내가 소유한 차
		
		public Owner(String name, Car[] car1) {
			this.name = name;
			this.car1 = car1;
		}
		
/*		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
*/
		public Car[] getCar1() {
			return car1;
		}
							//파라미터에서 Car를 받을때 마찬가지로 []배열로 받아야한다
		public void setCar1(Car[] car1) {
			this.car1 = car1;
		}
		
		//차량 소개 메소드
		public void introCar() {
			for (int i=0; i < car1.length; i++) {
				System.out.print("이름: " + this.name + "/ 차: ");
				System.out.print(car1[i].getBrandName() + "/ 최고속도: ");
				System.out.println(car1[i].getMaxSpeed() + "km/h");
		
			}
			System.out.println("총 " + car1.length + "대 입니다");
		}
}
