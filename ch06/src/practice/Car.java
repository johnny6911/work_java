package practice;

public class Car {
	
	int maxSpeed;
	int speed;
	
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void speedUp() {
		this.speed += 5;
		System.out.println("speedUp() 호출: 최대속도: " + this.maxSpeed 
				+ ", 현재속도: " + this.speed);
	}
	
	public void speedUp(int speed) {
		System.out.print("speedUp(" + speed + ") 호출: ");
		if (speed < 0) {
			System.out.println("오류: 속도가 음수이므로 0으로 지정: 최대속도: " 
				+ this.maxSpeed + ", 현재속도: " + this.speed);
		}
		else if (this.speed + speed > this.maxSpeed) {
			System.out.print("최대속도보다 높아 최대속도로 지정, ");
			this.speed = this.maxSpeed;
		}
		else {
			this.speed += speed;
		}
		
		System.out.println("최대속도: " + this.maxSpeed 
				+ ", 현재속도: " + this.speed);
	}
	
	public void speedDown() {
		this.speed -= 5;
		System.out.println("speedDown() 호출: 최대속도: " + this.maxSpeed 
				+ ", 현재속도: " + this.speed);
	}
	
	public void speedDown(int speed) {
		System.out.print("speedDown(" + speed + ") 호출: ");
		if (speed < 0) {
			System.out.println("오류: 속도가 음수이므로 0으로 지정: 최대속도: " 
				+ this.maxSpeed + ", 현재속도: " + this.speed);
		}
		else if (this.speed - speed < 0) {
			System.out.print("속도가 0보다 작아져 0으로 지정, ");
		}
		else {
			this.speed -= speed;
		}
		
		System.out.println("최대속도: " + this.maxSpeed 
				+ ", 현재속도: " + this.speed);
	}
	
	public static void main(String[] args) {
		Car mycar = new Car(300);
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedUp(-50);
		mycar.speedUp(50);
		mycar.speedDown(-30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedUp(100);
		mycar.speedUp(300);
	}
}
