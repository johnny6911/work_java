package Test;

public class Car {

	int maxSpeed;
	int speed;
	
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void speedUp() {
		this.speed += 5;
		System.out.println("speedUp 호출 : 최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
	}
	
	public void speedUp(int speed) {
		System.out.println("speedUp(" + speed + ") 호출: ");
		if(speed < 0) {
			System.out.println("오류: 속도가 음수이므로 0으로 지정: 최대속도: " + this.maxSpeed +", 현재속도: " + this.speed);
		}
		else if (this.speed + speed > this.maxSpeed) {
			System.out.print("");
			this.speed = this.maxSpeed;
		}
		else {
			this.speed += speed;
		}
	}
	
	public void speedDown() {
		this.speed -= 5;
		System.out.println("speedDown 호출 : 최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed)
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void speedDown() {
		Car mycar= new Car(300);
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedUp(-30);
		mycar.speedUp(30);
		
	}
}
