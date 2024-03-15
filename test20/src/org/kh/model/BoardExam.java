package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Board;

public class BoardExam {

	public static void main(String[] args) {
		List<Board> bList = new ArrayList<>();
		
		for(int i=1; i<=10; i++) {
			Board b = new Board(i,"제목"+i,"내용"+i,"저자"+i, "2024-03-0"+i, i);
			bList.add(b);
		}
		
		for(Board b : bList) {
			System.out.println(b.toString());
		}
	}

}
