package programming.basic;

public class HelloProgramming02 {
	//static ������ �������� Ŭ���� ��ü���� �����̵�
	//(Global Variable)
	static String hello = "�ȳ��ϼ���";
	static String hello02 = "�ȳ�?";
	
	public static void main(String[] args) {
		//�������� main������ �����̵�
		/*Local Variable
		 dddd*/
		String hello2 = "hello! guys";
	
		System.out.println(hello2);
		chul09(hello2);
	}
	/* ���  ��Ʈ�� + ����Ʈ + ������ Ȥ�� ����������
	 * �ּ��� ���� Ȥ�� ���� ����
	 */
	static void chul09(String pika) {
		System.out.println(pika);
		System.out.println(pika);
		
	}
}

// JavaDoc Ÿ�� �ּ�
/**
 * 
 *@���� ����
 * @
 */
