package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.database.Student;

public class MariaDBExam2 {

	public static void main(String[] args) {
		Student newSt = new Student(8, "김대희", 48);
		Connection con = null;
		PreparedStatement pstmt = null;
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		String sql = "insert into student values(?,?,?)";
		int i = 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, newSt.getNo());
				pstmt.setString(2, newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
				i = pstmt.executeUpdate();
				if(i >0) {
					System.out.println("SQL 정상 실행");
				} else {
					System.out.println("SQL 실행 오류");
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
