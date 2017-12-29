package test;

public class Testopposite {
	public static void main(String[] args) {
		
		int i, j;
		
		// 곱하는 수를 고정 i와 j 앞에 int타입을 선언하여도 된다
		for ( i= 1; i <= 9; i++) {
			for (j = 2; j <= 9; j++) {
				System.out.printf("%d * %d =%02d "+"  ", j, i, i * j);
			}
			System.out.println();
		}	
		
	}
}
