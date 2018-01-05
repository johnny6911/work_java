package inheritance.abstractinterface;

public class HPPrinter extends Device implements Connectable{
	
	
	@Override
	public void print() {
		System.out.println("HP 프린터 입니다");
	}

	@Override
	public void connect() {
		System.out.println(Connectable.name + ", HP 프린터를 연결 합니다"); //Connectable이 스태틱이기때문에 .name을 써줘야한다
	}

}