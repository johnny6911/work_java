package inheritance.abstractinterface;

public class USBMemory extends Device implements Connectable{

	//클래스 Device의 추상 메소드 구현
	@Override
	public void print() {
		System.out.println("삼성 usb 메모리 입니다");
	}

	//인터페이스 Connectable의 추상 메소드 구현
	@Override
	public void connect() {
		System.out.println(Connectable.name + ", USB 메모리를 연결합니다");
	}
	

}
