package com.koitt.java.board;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardContoller {
	
	private BoardService service; // 서비스를 가지고 있어야함
	private Scanner input;		// 멤버변수
	
	public BoardContoller() {
		// Service 사용을 위해 객체 생성
		this.service = new BoardService();
		// 정보를 입력받기 위해 객체 생성
		this.input = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		BoardContoller controller = new BoardContoller(); //1메뉴출력전 컨트롤러 객체 만듬
		
		Scanner input = new Scanner(System.in); //3
		
		while(true) { //2계속 반복되도록 while문으로 만들어줌
			System.out.println("=== 자유게시판 ===");
			System.out.println("1. 게시글 작성");
			System.out.println("2. 글 목록");
			System.out.println("3. 게시글 삭제");
			System.out.println("4. 게시글 수정");
			System.out.println("5. Exit");
			System.out.println("원하는 메뉴번호 입력 >");
			
			int menu = -1;
			try {
			menu = Integer.parseInt(input.nextLine()); //파스인트를 이용해 스트링을 숫자로 바꿔줌
			}
			catch(NumberFormatException e) {
				System.out.println("명령어는 숫자로만 입력가능합니다.");
				continue;
			}
			switch (menu) {
				case 1:
					controller.menuAdd();
					break;
				case 2:
					controller.menuRead();
					break;
					
				case 3:
					controller.menuRemove();
					break;
					
				case 4:
					controller.menuModify();
					break;
					
				case 5:
					System.out.println("게시판을 종료합니다.");
					System.exit(0); // 프로그램 종료
					break;
					
				default:
					System.out.println("메뉴 번호를 잘못 입력하셨습니다");
			}
			
		}
	}
	

	public void menuAdd() {

		System.out.println("=== 게시글 정보를 작성해주세요. ===");
		
		System.out.print("글 제목 입력:");
		
		String title = this.input.nextLine();
		
		System.out.print("글 내용 작성:");
		String content = this.input.nextLine();
		
		System.out.println("작성자 입력:");
		String writer = null;
		try {
		writer = this.input.nextLine();
		}
		catch(Exception e) {
			System.out.println("문자만 입력 가능합니다");
			return;
		}
		Date regDate = new Date();
		
		Board b = new Board(0, title, content, writer , regDate);
		try {
			this.service.add(b);
			System.out.println("입력완료!");
		}
		
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	// 읽어오기
	public void menuRead() {
		System.out.println("=== 게시글 전체 목록 ===");
		
		// Service를 통해 입력했던 인적사항 모두를 불러오기
		List<Board> list = this.service.read();
		
		for (Board item : list) {
			System.out.println(item);
		}
	}
	
	public void menuRemove() {
		System.out.println("=== 삭제할  글 번호를 입력해 주세요 ===");
		try {
		System.out.print("삭제할 글 번호 입력: ");
		Integer id = Integer.parseInt(this.input.nextLine());
		
		Board b = new Board(id, null, null, null, null);
		
		
		service.remove(b);
		System.out.println(b.getId() + "번째 글이 삭제되었습니다.");
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void menuModify() {
		int id = 0;
		System.out.println("=== 수정할 게시글 번호를 입력해 주세요 ===");
		
		System.out.println("게시글 번호: ");
		
		try {
			id = Integer.parseInt(this.input.nextLine());
		}
		catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}
		
		Board tempBoard = new Board(id, null, null, null, null);
		boolean isExist = this.service.isExist(tempBoard);
		if (!isExist) {
			System.out.println("수정할 게시글이 존재하지 않습니다!");
			return;
		}
		
		System.out.print("수정할 글 제목 입력: ");
		
		String title = this.input.nextLine();
		
		System.out.print("수정할 글 내용 작성: ");
		String content = this.input.nextLine();
		
		//Date regDate = new Date();
		
		Board b = new Board(id, title, content, null, null);
		
		try {
		service.modify(b);
		System.out.println(b.getId() + "번째 글의 정보가 수정되었습니다.");
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
