package inheritance.typecast;

public class DownCasting {
	
	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		System.out.println(she.name + " " + she.number);
		//Faculty f = she;			// 컴파일 오류
		//Faculty f1 = (Faculty) she; // 실행 오류 (Runtime Exception) 부모는 자식인척을 할수없다
		
		Person p = new Staff("김상기", 1187543, "강서대학교", 3456); // 부모(Person)는 자식(Staff)을 품을수 있음
		//Staff s = p;
		Staff s = (Staff) p; //p는 잠시 Staff로 타입을 바꿈	p와 s는 같은 객체를 가르키고있음//다운캐스팅
		s.division = "교학처";
		System.out.print(p.name + " " + p.number + " ");
		System.out.print(s.univ + " " + s.number + " ");
		System.out.println(s.division);
		
		Faculty f2 = s; // 업캐스팅
		Staff s1 = (Staff) f2; //다운캐스팅(잠깐 부모행세했다 다시 본인으로 돌아오는것)
	}
}
