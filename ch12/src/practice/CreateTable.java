package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String DBName = "World_0";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBName;

			String sqlCT = "create table city (" +
					"id		int				NOT NULL	auto_increment, " +
					"name	varchar(20)		NOT NULL, " +
					"major	varchar(20)		, "	+
					"pop	int		," +
					"PRIMARY KEY (id) " +
					");";

			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
	
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate(sqlCT);
			System.out.println("테이블 city가 생성되었습니다");
			
			stmt.executeUpdate("insert into city values (1, '서울', '이명길', 20000000);");
			stmt.executeUpdate("insert into city values (2, '인천', '김동훈', 3500000);");
			stmt.executeUpdate("insert into city values (3, '대구', '강수벅', 3000000);");
			stmt.executeUpdate("insert into city values (4, '부산', '남기문', 5000000);");
			stmt.executeUpdate("insert into city values (5, '목포', '신용현', 2000000);");
			System.out.println("테이블 city에 5개의 튜플이 삽입되었습니다");
			
			stmt.close();
			con.close();
		
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}


	}
}
