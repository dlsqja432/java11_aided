package org.kh.database2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MariaDBExam4 {

	public static void main(String[] args) {
		MariaDB maria = new MariaDB();
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "delete from student where no=?";
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 번호 입력 : ");
		int no = sc.nextInt();
		int i = 0;
		
		con = maria.connect();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println("삭제 완료");
			} else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			maria.close(con, pstmt);
		}
	}
}
