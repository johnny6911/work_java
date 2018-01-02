package obj.defaultcontructor;

public class Student {
	
	public String name;
	
	//기본 생성자 구현
	public Student() {
		
	}
	
	//이름을 지정하는 생성자 구현
	public Student(String name) {
		this.name = name;//this=lee 의 네임에다가 이승준이라는 문자열을 입력
	}
	
	public void print() {
		System.out.println("학생이름: " + this.name);
		
	}
	
	public static void main(String[] args) {
		Student lee = new Student("이승훈");
		lee.print();
		
		//이름을 인자로 하는 생성자가 구현되어 있으므로
		//기본 생성자를 직접 구현해야 다음과 같이 기본 생성자로 객체 생성 가능
		Student kim = new Student();
		kim.name = "김다빈";
		kim.print();
	}
}
