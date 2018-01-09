package operator;

public class PriorityOP {
	
	public static void main(String[] args) {
		System.out.println(3 + 4 >> 2 > 5); // 7을 오른쪽으로 2만큼 이진수로 변환해서 이동했을때 그 수를 십진수로 한 결과가 5보다 클경우 true 같으면 작을경우 false 
		System.out.println(((3 + 4) >> 2) > 5);
		System.out.println(3*4 & 4-3 << 5);
		System.out.println(3*4 & (4-3 << 5));
		System.out.println((3*4 & 4-3) < 5);
		System.out.println((1&0) != 1 && 3<<2 > 5);
	}
}
