package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {

		private String name; // 내 이름
		private Car car1;	// 내가 소유한 차
		
		public Owner(String name, Car car1) {
			this.name = name;
			this.car1 = car1;
		}
		
/*		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Car getCar1() {
			return car1;
		}

		public void setCar1(Car car1) {
			this.car1 = car1;
		}*/
		
		//차량 소개 메소드
		public void introCar() {
			System.out.print("이름은 " + this.name + "이고 차는 ");
			System.out.print(car1.getBrandName() + "이고, 최고속도는 ");
			System.out.println(car1.getMaxSpeed() + "입니다");
		}
}
