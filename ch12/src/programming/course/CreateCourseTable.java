package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateCourseTable {
	public static void main(String[] args) {
		try { //0이 출력되면 정상적으로 테이블이 만들어졌다는것
			String url = "jdbc:mysql://localhost:3306";
			String dbName = "univ";
			
			// 1. 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. 데이터베이스 연결
			Connection conn = DriverManager.getConnection(url + "/" + dbName, "root", "koitt");
			
			// 3. SQL문 작성
			StringBuilder sql = new StringBuilder();
			sql.append("CREATE TABLE course (");
			sql.append("id INT, ");
			sql.append("name VARCHAR(30), ");
			sql.append("professor VARCHAR(30), ");
			sql.append("maxnum INT, ");
			sql.append("PRIMARY KEY (id)");
			sql.append(");");
			
			// 4. SQL을 위한 객체 생성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
			// 5. SQL 문장 실행
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
			// 6. 객체 연결 해제
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
