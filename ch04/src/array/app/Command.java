package array.app;

public class Command {
	public static void main(String[] args) {
		System.out.println("명령행 인자 갯수 > " + args.length);
		
		for (String value: args)
			System.out.print(value + " ");
	}
}
