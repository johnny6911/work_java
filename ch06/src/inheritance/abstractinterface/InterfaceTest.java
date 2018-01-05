package inheritance.abstractinterface;

public class InterfaceTest {
	public static void main(String[] args) {
		Device[] pdev = {new HPPrinter(), new USBMemory()};
		
		pdev[0].print();
		pdev[1].print();
		((Connectable) pdev[0]).connect();
		((Connectable) pdev[1]).connect();
	}
}
