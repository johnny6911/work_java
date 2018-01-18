package practice8;
								//1. 체크예외 만들기: 반드시 예외처리가 필요할 경우
public class InvalidWithdraw extends /*Exception*/ RuntimeException /*비체크 예외*/{
	// 2.
	private static final long serialVersionUID = 1L;
	
	// 3.
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
