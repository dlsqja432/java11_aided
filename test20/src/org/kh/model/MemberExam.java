package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;

public class MemberExam {
	Scanner sc = new Scanner(System.in);
	List<Member> memList = new ArrayList<>();
	public static void main(String[] args) {
		MemberExam app = new MemberExam();
		app.mainCall();
	}
	
	// 메뉴를 반복 호출하고, 키보드에서 각 해당 번호를 누르면 각 작업이 이루어 질 수 있도록 하시오.
	public void mainCall() {	// 1. 회원가입, 2. 회원 목록, 3. 회원 삭제, 4. 프로그램 종료
		while(true) {
			System.out.println("=== 원하시는 작업을 선택해주세요. ===");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 목록");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 프로그램 종료");
			int input = sc.nextInt();
			
			if(input == 1) memberAdd();
			if(input == 2) memberList();
			if(input == 3) memberRemove();
			if(input == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
	
	public void memberAdd() {
		System.out.print("멤버 코드 입력 : ");
		int memCode = sc.nextInt();
		System.out.print("아이디 입력 : ");
		String memId = sc.next();
		System.out.print("패스워드 입력 : ");
		String memPw = sc.next();
		System.out.print("이름 입력 : ");
		String memName = sc.next();
		System.out.print("출생년도 입력 : ");
		int memYear = sc.nextInt();
		System.out.print("전화번호 입력 : ");
		String memPhone = sc.next();
		
		Member m = new Member(memCode, memId, memPw, memName, memYear, memPhone);
		memList.add(m);
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println();
	}
	
	public void memberList() {
		if(memList.isEmpty()) {
			System.out.println("가입된 유저가 없습니다.");
		}
		for(Member m : memList) {
			System.out.println(m.toString());
		}
		System.out.println();
	}
	
	public void memberRemove() {
		System.out.print("삭제할 아이디 입력 : ");
		String id = sc.next();
		int count = 0;
		int memSize = memList.size();
		for(int i=0; i<memList.size(); i++) {
			if(memList.get(i).getId().equals(id)) {
				System.out.println(memList.get(i).toString() + "가 삭제되었습니다.");
				memList.remove(i);
				break;
			}
			count++;
		}
		if(count==memSize) {
			System.out.println("존재하지 않는 아이디 입니다.");
		}
		System.out.println();
	}
}
