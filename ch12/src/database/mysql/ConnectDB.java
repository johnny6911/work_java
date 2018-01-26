package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static void main(String[] args) {
		try {
		//JDBC 드라이버의 이름 지정
		String driverName = "com.mysql.jdbc.Driver"; // 드라이버 클래스를 사용하기 위해 경로를 지정함
		
		//JDBC 드라이버 로드
			Class.forName(driverName); // 클래스(여기선 Driver) 정보를 불러오고 싶을때 씀
		
		//접속할 정보인 URL 지정
		String dbURL = "jdbc:mysql://localhost:3306"; //접속하기위해 지정
		
		//데이터베이스에 연결(로그인에 성공하면 con이라는 객체에 정보를 담게됨)
		Connection con = DriverManager.getConnection(dbURL, "root", "koitt"); //getConnection이라는 static 메소드 사용
		System.out.println("MySql 데이터베이스에 성공적으로 접속했습니다");
		con.close(); // 접속을 종료해줌
		
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("MySql 데이터베이스 접속에 문제가 있습니다");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
