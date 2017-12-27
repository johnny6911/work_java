package operator;

public class PriorityOP {
	
	public static void main(String[] args) {
		System.out.println(3 + 4 >> 2 > 5);
		System.out.println(((3 + 4) >> 2) > 5);
		System.out.println(3*4 & 4-3 << 5);
		System.out.println(3*4 & (4-3 << 5));
		System.out.println((3*4 & 4-3) < 5);
		System.out.println((1&0) != 1 && 3<<2 > 5);
	}
}
