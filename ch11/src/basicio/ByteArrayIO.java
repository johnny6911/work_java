package basicio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayIO {
	public static void main(String[] args) {
		int c; // 임시로 저장할 공간 만듬
		byte b [] = {'a','b','c','d'}; // 바이트 Array
		
		//배열 b를 읽는 ByteArrayInputStream 객체를 생성
		ByteArrayInputStream bInput = new ByteArrayInputStream(b); //바이트 b의 배열값을 입력받음
		
		//배열 b를 소문자를 대문자로 출력하는 ByteArrayOutputStream 객체를 생성
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream(); // 객체를 만들어서 아웃풋스트림을 이용해서 입력을 받는것
		
		System.out.println("문자를 읽어 대문자로 출력");
		while((c = bInput.read()) != -1) { //a의 해당하는 인트값이 c에 들어감 read 메소드의 리턴은 int, d의 다음은 -1(파일이나 배열의 끝은 -1)
			System.out.print((char)c);	//캐릭터형으로 형변환
			
			//객체 ByteArrayOutputStream 대문자를 출력
			bOutput.write(Character.toUpperCase((char)c));
		}
		System.out.println();
		//ByteArrayOutputStream을 출력하면 출력된 자료가 그대로 출력됨
		System.out.println(bOutput);
		
		//배열 Arrays 메소드 toString() 사용하여 각각 입력 값과 출력 값을 출력
		System.out.println(Arrays.toString(b)); // b에 있는 내용을 바이트 타입의 10진수로 출력
		System.out.println(Arrays.toString(bOutput.toByteArray())); //대문자로 바뀐 b의 내용을 바이트 타입의 10진수로 출력
	}
}
