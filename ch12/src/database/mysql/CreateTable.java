package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateTable {
	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String DBName = "myjavadb";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBName;

			//+ "?useUnicode=true&characterEncoding=euckr";
			String sqlCT = "create table student (" +
					"id 	varchar(20)		NOT NULL, " +
					"name 	varchar(20)		NOT NULL, " +
					"snum	int				NOT NULL, " +
					"dept 	varchar(20)		NOT NULL, " +
					"PRIMARY KEY (id) " +
					");";

			// JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			// 질의를 할 Statement 만들기
			Statement stmt = con.createStatement();
			
			//데이터베이스 myjavadb에 테이블 student 만들기
			stmt.executeUpdate(sqlCT); // 쿼리문 실행
			System.out.println("테이블 student가 생성되었습니다");

			//데이터베이스 myjavadb의 테이블 student에 레코드 삽입
			stmt.executeUpdate("insert into student values ('01', '홍길동', 20125678, '전산학과');");
			stmt.executeUpdate("insert into student values ('02', '홍동', 20155678, '전산학');");
			stmt.executeUpdate("insert into student values ('03', '홍길', 20665678, '산학과');");
			System.out.println("테이블 student에 3개의 레코드가 삽입되었습니다.");
			
			stmt.close(); //스테이트먼트도 닫아줘야함
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("MySql 데이터베이스에 문제가 있습니다");
			e.printStackTrace();
		}
	}
}
