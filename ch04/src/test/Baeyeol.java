package test;

import java.util.Scanner;

public class Baeyeol {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int a = input.nextInt();
		
		// 행을 만들어주는 과정	.char b배열의 대한 a의 값은 length가 된다
		char b[][] = new char[a][];
		
		// 1. 열을 만들어주는 과정
		for (int i=0; i<b.length; i++) {
			 b[i] = new char[i + 1];
		}
		
		// 2. 열안에 *을 대입해주는 과정
		for (int i=0; i<b.length; i++) {
			for (int j=0; j < b[i].length; j++) {
				b[i][j] = '*';
				//System.out.print(b[i][j]);
			}
			//System.out.println();
		}
//		3. *을 열에 출력해주는 과정
		for (int i=0; i<b.length; i++) {
			for (int j=0; j <= i; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
		
		input.close();
	}
}
