package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Worlddb {
	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String dbURL = "jdbc:mysql://localhost:3306";
			
			//JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			Statement stmt = con.createStatement();
			
			int num = stmt.executeUpdate("CREATE DATABASE World_0;");
			if (num == 1) {
				System.out.println("데이터베이스 World_0가 생성되었습니다");
			}
			else {
				System.out.println("이미 생성되어 있는 데이터베이스 입니다");
			}
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩에 실패했습니다");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("JDBC 드라이버에 문제가 있습니다");
			e.printStackTrace();
		}
	}
}
