package enumeration;

public class EnumTest {
	public enum P1 {c, cpp, java, csharp}; // 이넘은 배열은 아님, 여기서 P1은 클래스를 뜻함
	public int[] a = {10, 20, 30, 40, 50};
	
	public static void main(String[] args) {
		P1 clang = P1.c;		// 정의한 열거 유형은 하나의 자료 유형으로 이용
		System.out.println(clang); //toString()을 자동으로 호출하고있음
		
		clang = P1.csharp;
		switch(clang) {
			case csharp:
				System.out.println(clang + ": C# 언어 ");
		}
		
		//for-each문
		for (P1 p : P1.values()) { //P1.values가 배열처럼 저장된 데이터들을 순서대로 하나씩 꺼냄
			System.out.print(p + " ");
		}
		System.out.println();
		
		EnumTest t = new EnumTest();
		for (int item : t.a) {
			System.out.println(item);
		}
	}
}
