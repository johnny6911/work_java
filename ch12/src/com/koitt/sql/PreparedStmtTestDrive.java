package com.koitt.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PreparedStmtTestDrive {

	public static void main(String[] args) {

		String driverName = "com.mysql.jdbc.Driver";
		String DBName = "myjavadb";
		String dbURL = "jdbc:mysql://localhost:3306/" + DBName;
		
		// 1. JDBC 드라이버 로딩
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			// 2. SELECT 문 사용
			String sql = "SELECT * FROM student;";
			PreparedStatement pstmt = con.prepareStatement(sql); //실행 전에 미리 Query문을 세팅하고 객체를 생성함
			ResultSet result = pstmt.executeQuery(); //셀렉트문 할땐 Query를 씀
			
			while (result.next()) {
				System.out.print(result.getString(1) + "\t"); // 첫번째꺼 뺴오라는소리
				System.out.print(result.getString(2) + "\t");	// 이름
				System.out.print(result.getInt(3) + "\t"); 	// 3번째는 숫자이기 때문에 getInt
				System.out.println(result.getString(4));	// 과
			}
			
			result.close();
			pstmt.close();
			
			// 3. INSERT 문
			sql = "INSERT INTO student VALUES(?, ?, ?, ?)"; // student라는 테이블에 값을 집어넣어주는것
			pstmt = con.prepareStatement(sql); //쿼리문을 먼저 만들어준다음
			pstmt.setString(1, "04");
			pstmt.setString(2, "고길동");
			pstmt.setInt(3, 20131122);
			pstmt.setString(4, "컴퓨터공학과");
			pstmt.executeUpdate(); // db에 입력이 됨
			
			pstmt.setString(1, "05");
			pstmt.setString(2, "둘리");
			pstmt.setInt(3, 20151122);
			pstmt.setString(4, "컴퓨터공학과");
			pstmt.executeUpdate(); // db에 입력이 됨
			pstmt.close();
			
			// 4. 종료
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
