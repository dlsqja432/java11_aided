package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// delete from 테이블명 [where 필드명=값] : 테이블의 특정 조건에 맞는 레코드 삭제
public class OracleExam4 {

	public static void main(String[] args) {
		Connection con = null;	// 연결
		PreparedStatement pstmt = null;	// 상태 변경(ON/OFF) 하고, SQL 문장 실행
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "delete from student where no=?";
		Student st = new Student(3, "장혜교", 58);
		int i = 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, st.getNo());
				i = pstmt.executeUpdate();
				if(i > 0) {
					System.out.println(i + "건이 정상적으로 처리되었습니다.");
				} else {
					System.out.println("SQL 처리 실패");
				}
			} catch (SQLException e) {
				System.out.println("데이터베이스 접속 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
