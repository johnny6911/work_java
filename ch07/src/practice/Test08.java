package practice;

import java.util.HashMap;
import java.util.Map;

public class Test08 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] words = {"java", "c", "java", "cpp", "cobol", "java"};
		words[0] = "java";
		words[1] = "c";
		words[2] = "java";
		words[3] = "cpp";
		words[4] = "cobol";
		words[5] = "java";
		
		for(int i = 0; i < words.length; i++) {
			Integer num = map.put(words[i], map.get(words[i])); // 이미 들어가있으면 그때의 값이 리턴이 됨
			if (num == null) { // num 값은 null이 리턴이 됨
				map.put(words[i], 1);
			}
			else {
				map.put(words[i], map.get(words[i]) + 1);
			}
		}
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		Map<String, Integer> map2 = new HashMap<String,Integer>();
		Integer num3 = map2.put("count", 1);
		System.out.println("count key값의 이전 값: " + num3 
				+ " / 현재 count key의 value값: " + map2.get("count"));
		
		Integer num4 = map2.put("count", map2.get("count") + 1);
		System.out.println("count key값의 이전 값: " + num4 
				+ " / 현재 count key의 value값: " + map2.get("count"));
	}
}
