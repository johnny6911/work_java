package com.koitt.java.ch07;

public class WrapperCharacter {

	public static void main(String[] args) {
		//Character ch = new Character('@');
		Character ch = '@'; // boxing
		Character ch2 = '@';
		
		System.out.print(ch + " ");	// unboxing 자동으로 컴파일러가 빼내주는것을 말함
		System.out.print(ch.charValue() + " "); // 그냥 호출한것
		System.out.println(ch.toString());
		System.out.print(ch.compareTo('@') + " "); // 비교하는것
		System.out.println(ch.hashCode()); //가짜주소 @의 주소값(클래스 영역 메모리에 콘스탄트풀에 들어가 있으므로 64번)
		System.out.println(ch2.hashCode()); // 위 @와 같음
		System.out.println();
		
		//정적 메소드
		System.out.print(Character.toUpperCase('d') + " "); // 대문자로 바꿔주는것
		System.out.println(Character.toLowerCase('F')); 	// 대문자를 소문자로 바꿔주는것
		System.out.print(Character.getName('@') + ", ");	
		System.out.print(Character.getName('|') + ", ");
		System.out.println(Character.getName('^') + " ");
		System.out.print(Character.isDigit('$') + " ");		// 숫자인지 아닌지 검사할때 맞으면 true 아니면 false
		System.out.println(Character.isDigit('5'));			// 숫자가 맞으므로 true
	}
}
