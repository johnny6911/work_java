package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test09 {
	
	public static void main(String[] args) {
		Map<String, String> list = new HashMap<String, String>();
		Scanner input = new Scanner(System.in);
		System.out.println("검색할 이름을 적으시오 : ");
		String a = input.next();
		
		list.put("손오공", "010 4443 1555");
		list.put("아구몬", "010 5353 3535");
		list.put("네이마르", "013 3550 3100");
		
			//for (String key : list.keySet()) {
				//String list1 = list1.get(a);
				System.out.println(a + ": ");
			//}
	
		
		input.close();
		
	}
	
}
