package test;

public class AccountTest {
	public static void main(String[] args) {
		Account6 account = new Account6("홍길동",1000000);
		System.out.println("현재 잔액: " + account.withdraw(800000));
	}
}
