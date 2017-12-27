package programming.basic;

public class HelloLiterals {

		static long creditCardNumber = 1234567890123456L;	// _는 Java 7부터 적용됨
		static long socialSecurityNumber = 999_99_9999L;
		static float pi = 3.14_15F;
		
		public static void main(String[] args) {
			
			System.out.println(0b1010); //이진수
			System.out.println(016);	//8진수
			System.out.println(0x1F);	//16진수
			System.out.println(3.14f);	//float 형
			System.out.println(3.1415D);//double 형
			System.out.println(creditCardNumber);
			System.out.println(socialSecurityNumber);
			System.out.println(pi);
		}
}
