package test;

public class Test7 {
	public static void main(String[] args) {
		
		int n = 0;
		int sum = 0;
		
		while (sum < 5000) {
			n++;
			sum += n;
		}
		
		System.out.printf("가장 큰 합: %d, 그 때의 n: %d", sum - n, --n);
	}
}
