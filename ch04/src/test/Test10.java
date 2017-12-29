package test;

public class Test10 {
	public static void main(String[] args) {
		int[][]	pascal = new int[10][];
		
		// 래기드 배열 만들기
		for (int i = 0; i < pascal.length; i++) {
			pascal[i] = new int[i + 1];
		}
		
		// 순차적으로 돌면서 계산결과 저장
		// 2차원 배열이니까 2중 for문
		for (int n = 0; n < pascal.length; n++) {
			for (int r = 0; r < pascal[n].length; r++) {
				pascal[n][r] = factorial(n) / (factorial(r) * factorial(n-r));
			}
		}
		
		//순차적으로 출력
		for (int n = 0; n < pascal.length; n++) {
			for (int r = 0; r < pascal[n].length; r++) {
				System.out.print(pascal[n][r] + " ");
			}
			System.out.println();
		}
	}
	// 0!(펙토리얼)은 1이라고 정해져 있으므로 1을 리턴함 (1! = 1)(2! = 1x2)(3! = 1 x 2 x 3)
	static int factorial(int n) {
		int mult = 1;
		
		if (n == 0) {
			return 1;
		}
		
		//1부터 n까지 곱하는 for문
		for (int i = 1; i <= n; i++) {
			mult *= i;
		}
		
		return mult;
	}
}
