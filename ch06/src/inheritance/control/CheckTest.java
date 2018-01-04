package inheritance.control;

import inheritance.access.SavingAccount;

public class CheckTest {
	
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("김태희", 23456734, 0.34);
		myAccount.deposit(400000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);
		/*System.out.println(myAccount.open); //체크테스트 내부에 있기때문에 사용이 불가능
		System.out.println(myAccount.number); //같은 패키지 내부에 있어야하는데 서로 다른 패키지이므로 사용불가
		System.out.println(myAccount.balance);*/ //private 자신의 클래스 내부에서만 사용가능하기때문에 사용불가
		
		CheckAccount cAccount = new CheckAccount("이민정", 87542356, 500000);
		cAccount.deposit(250000);
		cAccount.withdraw(50000);
		cAccount.checkBalance();
		
		System.out.println(cAccount.name); //퍼블릭이라 전체적으로 사용가능하다
		System.out.println(cAccount.minimum); 
		//System.out.println(cAccount.open); // 체크 테스트 안에 있기때문에 사용불가능
		//System.out.println(cAccount.number); //같은 패키지 내부에 있어야 사용가능
		//System.out.println(cAccount.balance); // 벨런스는 private
	}
}
