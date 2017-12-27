package operator;

public class LogicalOP {
	public static void main(String[] args) {
		System.out.format("%5b && %5b | %b %n",true, true, true && true);
		System.out.format("%5b && %5b | %b %n",true, false, true && false);
		System.out.format("%5b && %5b | %b %n",false, true, false && true);
		System.out.format("%5b || %5b | %b %n",true, false, true || false);
		System.out.format("%5b || %5b | %b %n",false, true, false || true);
		System.out.format("%5b || %5b | %b %n",false, false, false || false);
		
		//! 부정은 반대로
		System.out.format("!%5b | %b %n", true, !true);
		System.out.format("!%5b | %b %n",false, !false);
	}
}
