package operator;

public class DevideByZero {

		public static void main(String[] args) {
			
			short data1 = 32766;
			short data2 = 1;
			//short data3 = data1 + data2; 			// 더한 결과가 int형으로 변환
			short data3 = (short)(data1 + data2);	//명시적 형변환 int -> short
			short data4 = 32766 + 1;
			System.out.println(data3 + " " + data4);
			
			System.out.println(0.0 /0.0); 	//NaN (not a number 숫자가 아니다)
			System.out.println(3 / 0.0);	//Infinity (무한대 : 3이 double형으로 변환)
			System.out.println(3 / 0);		//예외발생 (정수를 0으로 나눌 수 없기 때문에 예외발생)
			
			String money = "NaN";			//입금
			double moneyDouble = Double.parseDouble(money);
			if (Double.isNaN(moneyDouble)) {
				double balance = 30000;		//잔고 묵시적 형변환
				balance = balance + moneyDouble;
				System.out.println(balance);
			}
			else {
				System.out.println("금액을 다시 입력해주세요");
			}
					
		}
}
