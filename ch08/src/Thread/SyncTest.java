package Thread;

import java.util.Random;

class BankAccount{
	int balance = 0; // 은행잔고
	
	// 인출
	public synchronized void withdraw(int money) { // withdraw 메소드 전체를 임계영역으로 잡음
		// 현재 출금하려는 금액보다 잔고가 많은지 검사
		if (money >= 0 && balance >= money) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			this.balance -= money;
			System.out.printf("%s %d 인출하여 현재잔고 %d입니다. %n",
					Thread.currentThread().getName(), money, balance);
		}
		else if (balance < money) { //잔고가 부족했을때
			System.out.println("잔고가 부족하여 인출할 수 없습니다.");
		}
	}
	
	// 입금
	public void deposit(int money) {
		synchronized (this) { // 특정 영역을 임계영역으로 잡음(중괄호 시작부터 중괄호 끝나는 부분까지 임계영역으로 설정)
			if(money > 0) {
				balance += money;
				System.out.printf("%s %d 입금하여 현재잔고 %d입니다 %n", 
					Thread.currentThread().getName(), money, balance);
			}
		} // 여기까지가 임계영역(중괄호)의 끝나는 부분
	}
}

public class SyncTest implements Runnable{ // 러너블 상속받고있음
	BankAccount act = new BankAccount();
	
	public void run() { //런이라는 메소드 구현후 스레드가 해야할일을 만들어줌
		for (int i = 0; i < 3; i++) {
			int amount = new Random().nextInt(10000); // 0부터 10000까지 랜덤한 숫자를 10으로 나눈 나머지에 1000으로 곱해서 나옴
			amount = amount%10 * 1000; //10으로 나눈 나머지이기 때문에 1의 자리값에 1000을 곱한 값
			System.out.printf("[%s] 금액 = %d %n", Thread.currentThread().getName(), amount); // 가진 돈
			act.deposit(amount); 	//입금
			act.withdraw(amount*2); //출금 (2배로 한 이유는 잔고를 바닥나게 하기 위해서)
			if(act.balance < 0) {
				System.out.printf("[%s] ", Thread.currentThread().getName());
				System.out.println("잔고: " + act.balance + " => 오류 종료");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Runnable r = new SyncTest(); // 러너블 객체만듬
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		
		th1.setName("철수가");
		th2.setName("영희가");
		
		th1.start();
		th2.start();
	}
}
