package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam5 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from student";
		List<Student> stList = new ArrayList<>();
		
		// Select
		OracleDB oracleDB = new OracleDB();
		con = oracleDB.connect();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Student s = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
				stList.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			oracleDB.close(con, pstmt, rs);
		}
		
		for(Student s : stList) {
			System.out.println(s.toString());
		}
		
		// Insert
		con = null;
		pstmt = null;
		int i = 0;
		Student std = new Student(8, "임수정", 98);
		sql = "insert into student(name, no, point) values(?,?,?)";
		con = oracleDB.connect();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,std.getName());
			pstmt.setInt(2, std.getNo());
			pstmt.setInt(3, std.getPoint());
			i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println(i + "건 추가 성공");
			} else {
				System.out.println("SQL 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
			e.printStackTrace();
		} finally {
			oracleDB.close(con, pstmt);
		}
		
		// Update
		std = new Student(6, "오덕후", 42);
		con = null;
		pstmt = null;
		i = 0;
		sql = "update student set name=?, point=? where no=?";
		con = oracleDB.connect();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, std.getName());
			pstmt.setInt(2, std.getPoint());
			pstmt.setInt(3, std.getNo());
			i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println(i + "건 변경 성공");
			} else {
				System.out.println("SQL 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
			e.printStackTrace();
		} finally {
			oracleDB.close(con, pstmt);
		}
		
		// Delete
		std = new Student(5, "강원기", 65);
		con = null;
		pstmt = null;
		i = 0;
		sql = "delete from student where no=?";
		con = oracleDB.connect();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, std.getNo());
			i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println(i + "건 삭제 성공");
			} else {
				System.out.println("SQL 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 올");
			e.printStackTrace();
		} finally {
			oracleDB.close(con, pstmt);
		}
	}
}
