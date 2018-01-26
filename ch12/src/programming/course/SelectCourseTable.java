package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectCourseTable {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306";
			String dbName = "univ";
			
			// 1. 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
	
			// 2. 데이터베이스 연결
			Connection conn = DriverManager.getConnection(url + "/" + dbName, "root", "koitt");
			
			// 3. SQL문 작성
			String sql = "SELECT * FROM course"; //SELECT문을 씀
			
			// 4. SQL문 실행을 위한 객체 생성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 5. 질의결과 처리
			ResultSet rs = pstmt.executeQuery(); // ResultSet을 끄집어내기 위해서 셀렉트를 씀 익스큐트쿼리의 리턴타입은 리설트셋.
			System.out.printf("%s\t%s\t%s\t%s\n", "id", "name", "professor", "maxnum"); //필드명 출력하려고
			while (rs.next()) { //리절트셋에선 넥스트라는 메소드를 제공하고있음 반복문을 이용해서 한줄씩 넥스트가 출력해줌
				System.out.printf("%s\t%s\t%s\t%s\n",
						rs.getInt("id"), rs.getString("name"), rs.getString("professor"),
						rs.getInt("maxnum")); //필드명 자체를 입력하는것도 가능
			}
			
			// 6. 객체 연결 해제
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
