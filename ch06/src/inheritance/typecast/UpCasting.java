package inheritance.typecast;

public class UpCasting {

	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		System.out.println(she.name + " " + she.number);
		
		Faculty f = new Faculty("김영태", 1145782, "연한대학교", 38764);
		Person p = f;	// 부모타입의 변수는 자식 객체를 저장할수 있다
		System.out.print(p.name + " " + p.number + " ");
		//System.out.print(p.univ);	// 참조 불가능 //Person 클래스에는 univ가 없기때문에 참조할수 없다
		System.out.println(f.name + " " + ((Person) f).number); // Person에 있는 number로 접근한경우이다
		System.out.println(f.univ + " " + f.number);
		
		Staff s = new Staff("김상기", 1187543, "강서대학교", 3456);
		s.division = "교학처";
		Person pn = s; // 부모타입의 클래스로 업케스팅함
		Faculty ft = s;	// 업캐스팅
		System.out.print(pn.name + " " + pn.number + " ");
		System.out.print(ft.univ + " " + ft.number + " ");
		System.out.println(s.division); // 디비전은 Staff에 있다
	}
}
