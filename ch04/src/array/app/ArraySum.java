package array.app;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("배열 크기 입력 : ");
		int size = input.nextInt();
		
		int score[] = new int[size];
		
		System.out.print("성적 입력 > ");
		for (int i = 0; i<score.length; i++)
			score[i] = input.nextInt();
		
		// for each 문
		for (int value: score)
			System.out.print(value + " ");
		
		input.close();
	}
}
