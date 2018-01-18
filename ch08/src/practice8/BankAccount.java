package practice8;

public class BankAccount {
	private int balance; //잔고
	private int minBalance;	//최저잔금	
	
	public BankAccount(int minBalance) {
		this.minBalance = minBalance;
	}

	//6.
	public void deposit(int money) {
		this.balance += money;
		System.out.println("정상 입금처리: 입금금액=" + money + ", 잔금=" + this.balance);
	}
	
	//7.							//.9
	public void withdraw(int money) throws InvalidWithdraw{
		//8.
		
		// 요청 금액이 음수(-)이거나
		if (money < 0) {
			new InvalidWithdraw("E01: 요청 금액이 음수 입니다.");
		}
		
		//최저 잔금 이하로 인출을 요청할경우
		else if (this.balance - money < this.minBalance) {
			new InvalidWithdraw("초과 출금 예외.");
		}
		
		this.balance -= money;
		System.out.println("정상 인출처리: 인출금액=" + money + ", 잔금=" + this.balance);
	}


}
