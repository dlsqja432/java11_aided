package org.kh.database2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.database.Student;

public class MariaDBExam5 {

	public static void main(String[] args) {
		MariaDB maria = new MariaDB();
		Connection con = null;	// 연결
		PreparedStatement pstmt = null;	// 상태 변경(ON/OFF) 하고, SQL 문장 실행
		ResultSet rs = null;	// 검색(Select문)의 결과를 반환받음
		
		// select
		String sql = "select * from student";
		List<Student> stList = new ArrayList<>();
		con = maria.connect();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
				stList.add(st);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			maria.close(con, pstmt, rs);
		}
		for(Student st : stList) {
			System.out.println(st.toString());
		}
		
		// insert
		Student st = new Student(10, "메이플", 18);
		sql = "insert into student values(?, ?, ?)";
		con = null;
		pstmt = null;
		int i = 0;
		con = maria.connect();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, st.getNo());
			pstmt.setString(2, st.getName());
			pstmt.setInt(3, st.getPoint());
			i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println("삽입 성공");
			} else {
				System.out.println("삽입 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			maria.close(con, pstmt);
		}
	}
}
