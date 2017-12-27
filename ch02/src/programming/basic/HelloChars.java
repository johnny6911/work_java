package programming.basic;

public class HelloChars {
	public static void main(String[] args) {
		System.out.println('a');		//char(ĳ����) ��
		System.out.println('\\');		// \ ���
		
		// 8���� 142�� ASCII �ڵ� ��(10���� - 98�� ASCII �ڵ� ��)
		System.out.println('\142');		
		
		System.out.println('\uAC00');	// UTF-8 = unicode �� AC00 : ��.  AC�� 16������
		System.out.println('\uAC01');	// Unicode �� AC01 : ��
		System.out.println('��');
		
		System.out.print("Hello\nWorld\tHi\b\rABC\r\n"); // \n(����) �� \t
		System.out.println("\'");
	}
}
