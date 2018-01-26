package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDrive {
	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String DBName = "World_0";
		String dbURL = "jdbc:mysql://localhost:3306/" + DBName;

		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			String sql = "SELECT * FROM city;";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();

			while (result.next()) {
				System.out.print(result.getString(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.println(result.getInt(3));
			}

			result.close();
			pstmt.close();

			sql = "INSERT INT city VALUES(?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "서울");
			pstmt.setString(2, "이명길");
			pstmt.setInt(3, 20000000);
			pstmt.executeUpdate();
			
			pstmt.setString(1, "인천");
			pstmt.setString(2, "김동훈");
			pstmt.setInt(3, 3500000);
			pstmt.executeUpdate();
			
			pstmt.setString(1, "대구");
			pstmt.setString(2, "강수복");
			pstmt.setInt(3, 3000000);
			pstmt.executeUpdate();
			
			pstmt.setString(2, "부산");
			pstmt.setString(3, "남기문");
			pstmt.setInt(4, 5000000);
			pstmt.executeUpdate();
			
			pstmt.setString(1, "목포");
			pstmt.setString(2, "신용현");
			pstmt.setInt(3, 2000000);
			pstmt.executeUpdate();

			pstmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
