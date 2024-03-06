package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<Member> memList = new ArrayList<Member>();
		
		for(int i=1; i<=10; i++) {
			Member mem = new Member(i, "Jang"+i, "abcd"+i+i, "장"+i, 0);
			memList.add(mem);
		}
		
		Member mem2 = new Member(11, "kang", "abcd1004", "이성하", 0);
		memList.add(mem2);
		
		for(Member m : memList) {	// list의 순회1
			System.out.println(m.toString());
		}
		System.out.println();
		
		memList.remove(3);	// index가 3인 Member 인스턴스가 제거
		
		Member tmp1 = new Member(11, "kang", "abcd1004", "이성하", 0);
		
		System.out.println(tmp1.getId() + "의 존재 유무 : " + memList.contains(tmp1));
		
		for(int i=0; i<memList.size(); i++) { // list의 순회2
			System.out.println(memList.get(i).toString());
		}
		
		List<Member> memList2 = new ArrayList<Member>();
		
		if(memList2.isEmpty()) {
			System.out.println("빈 리스트 입니다.");
		}
		else {
			System.out.println("내용이 있는 리스트 입니다.");
		}
		
		List<String> names = new ArrayList<>();
		names.add("aaa");
		names.add("bbb");
		names.add("ccc");
		names.add("ddd");
		names.add("eee");
		names.add("fff");
		names.add("ggg");
		names.add("hhh");
		
		if(names.contains("qqq")) {
			System.out.println("qqq 데이터가 존재합니다");
		}
		else {
			System.out.println("qqq 데이터가 존재하지 않습니다.");
			names.add("qqq");
		}
		
		for(String s : names) {
			System.out.println(s);
		}
		
		names.clear();
		if(names.isEmpty()) {
			System.out.println("빈 리스트 입니다.");
		}
		else {
			for(String s : names) {
				System.out.println(s);
			}
		}
		
		// 자주 사용하는 메소드 : add, remove, contains, isEmpty, size, get
	}
}
