package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.database.Student;

public class MariaDBExam3 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt =null;
		Student st = new Student(8, "로다주", 67);
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		String sql = "update student set name=?, point=? where no=?";
		int i = 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, st.getName());
				pstmt.setInt(2, st.getPoint());
				pstmt.setInt(3, st.getNo());
				i = pstmt.executeUpdate();
				if(i > 0) {
					System.out.println("정상 실행");
				} else {
					System.out.println("실행 오류");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
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
