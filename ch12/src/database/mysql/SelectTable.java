package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTable {
	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String DBName = "myjavadb";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBName;
			String SQL = "select * from student";

			//JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			//질의를 할 Statement 만들기
			Statement stmt = con.createStatement();

			//데이터베이스 myjavadb의 테이블 student에 레코드 조회
			ResultSet result = stmt.executeQuery(SQL); // 쿼리라는 메소드를 실행
			System.out.println("    --- 테이블 student 내용 조회 ---");
			while (result.next()) {
				System.out.print(result.getString(1) + "\t"); // 첫번째꺼 뺴오라는소리
				System.out.print(result.getString(2) + "\t");	// 이름
				System.out.print(result.getInt(3) + "\t"); 	// 3번째는 숫자이기 때문에 getInt
				System.out.println(result.getString(4));	// 과
			}
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
}
