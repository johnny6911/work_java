package operator;

public class BitShift0P {
	
	public static void main(String[] args) {
		int x = 8, y = 3;
		System.out.format("%d(%s) >> %d 결과 %d(%s) %n", x, Integer.toBinaryString(x),
				y, x>>3, Integer.toBinaryString(x>>3));
		System.out.format("%d(%s) << %d 결과 %d(%s) %n", x, Integer.toBinaryString(x),
				y, x<<3, Integer.toBinaryString(x<<3));
		System.out.format("%d(%s) >>> %d 결과 %d(%s) %n", x, Integer.toBinaryString(x),
				y, x>>>3, Integer.toBinaryString(x>>>3));
		
	}

}
