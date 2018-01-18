package wait;

import java.util.Random;

class BankAccount{
	int balance = 0;	//은행 잔고

	public synchronized void withdraw(int money) {
		if (money < 0) {
			System.out.println("인출 금액이 잘못됐습니다.");
			return;
		}

		int count = 0;
		while (this.balance < money) {
			System.out.printf("[%s]", Thread.currentThread().getName());

			// 지속적으로 잔금이 부족하여 메소드 종료
			if (++count > 3) { //이 조건을 만족하려면 와일문을 3번돌아야함, 3번까지 기다려보고 수행
				System.out.println("잔액이 부족하여 출금처리 못하고 종료합니다.");
				return;
			}

			System.out.printf("%16s", "wait(1000) 호출: ");
			System.out.printf("인출요구금액 =%6d, balance=%6d %n",money, this.balance);
			try {
				wait(1000); // 다른사람이 입금할떄까지 기다리는것
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.printf("[%s]", Thread.currentThread().getName());
		this.balance -= money; // 잔고에서 뻄
		System.out.printf(" %12s 정상인출 금액 =%6d, balance =%6d %n", "정상 출금처리:", money, this.balance);
	}


	public synchronized void deposit(int money) {
		if (money < 0) {
			System.out.println("입금 금액이 잘못됐습니다");
			return;
		}
		this.balance += money;
		System.out.printf("[%s] ", Thread.currentThread().getName());
		System.out.printf("%16s", "notify() 호출: ");
		System.out.printf("계좌입금금액 =%6d, balance=%6d %n", money, balance);
		//this.notify();
		this.notifyAll(); //wait 걸렸던 스레드들을 다 깨우는것
	}
}

public class SyncTest implements Runnable{
	BankAccount act = new BankAccount();

	@Override
	public void run() { // 스레드에서 해야할 일을 정의하고있음
		for (int i = 1; i < 3; i++) { // 두번밖에 실행안함
			int amount = (int) (new Random().nextDouble() * 5 + 1) * 10000; //1부터 5까지 나온것 , 최대 5만까지 나옴
			act.deposit(amount);
			amount = (int) (new Random().nextDouble() * 5 + 1) * 10000;
			act.withdraw(amount);
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



