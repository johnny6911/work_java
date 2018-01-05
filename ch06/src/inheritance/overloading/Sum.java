package inheritance.overloading;

public class Sum {
	
	// 더하기 숫자 2개짜리
	public int add(int a, int b) {
		return a+b;
	}
	
	// 더하기 숫자 3개짜리
	public int add(int a, int b, int c) {
		return a+b*c;
	}
	
	// 더하기 배열과 배열의 크기를 입력받아서 배열의 합을 구하는 메소드
	public int add(int a[], int n) {
		int sum = 0;
		for (int i=0; i<n; i++) {
			sum += a[i];
		}
			return sum;
	}
	
	public static void main(String[] args) {
		Sum adder = new Sum();
		System.out.println(adder.add(3, 6));
		System.out.println(adder.add(3, 6, 9));
		System.out.println(adder.add(new int[] {3, 6, 7, 12}, 4));
	}
}
