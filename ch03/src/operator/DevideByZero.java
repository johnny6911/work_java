package operator;

public class DevideByZero {

		public static void main(String[] args) {
			
			short data1 = 32766;
			short data2 = 1;
			//short data3 = data1 + data2; 			// ���� ����� int������ ��ȯ
			short data3 = (short)(data1 + data2);	//����� ����ȯ int -> short
			short data4 = 32766 + 1;
			System.out.println(data3 + " " + data4);
			
			System.out.println(0.0 /0.0); 	//NaN (not a number ���ڰ� �ƴϴ�)
			System.out.println(3 / 0.0);	//Infinity (���Ѵ� : 3�� double������ ��ȯ)
			System.out.println(3 / 0);		//���ܹ߻� (������ 0���� ���� �� ���� ������ ���ܹ߻�)
			
			String money = "NaN";			//�Ա�
			double moneyDouble = Double.parseDouble(money);
			if (Double.isNaN(moneyDouble)) {
				double balance = 30000;		//�ܰ� ������ ����ȯ
				balance = balance + moneyDouble;
				System.out.println(balance);
			}
			else {
				System.out.println("�ݾ��� �ٽ� �Է����ּ���");
			}
					
		}
}
