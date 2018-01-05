package inheritance.overriding;

public class Overriding {
	
	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		she.printInfo();
		
		Person i = new Faculty("김영태", 11457, "연한대학교", 38764);
		i.printInfo();
		
		Person he = new Staff("최영기", 1167429, "남도대학교", 1287, "기획처"); // 다운캐스팅
		he.printInfo(); //he의 본체는 Staff
		Faculty f = (Faculty) he;
		f.printInfo();
		Staff s = (Staff) he;
		s.printInfo();
		
	}
}
