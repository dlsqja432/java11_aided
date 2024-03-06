package sec4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Set : 값만 저장, 중복을 허용하지 않음. 순서 유지 하지 않음
// Set 종류 : HashSet, TreeSet
public class SetExam {

	public static void main(String[] args) {
		// Set 의 선언 및 생성
		Set<String> set1 = new HashSet<>();
		Set<Integer> set2 = new TreeSet<>();
		
		set1.add("장인범");	// 요소의 추가
		set1.add("김기태");
		set1.add("엄준식");
		set1.add("샹크스");
		set1.add("이도현");
		set1.add("장인범");	// 중복 발생 -> 중복을 허용하지 않음
		set1.add("엄준식");
		set1.add("임꺽정");
		set1.add("송혜교");
		
		System.out.println("요소의 수 : " + set1.size());
		System.out.println(set1);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = scan.next();
		
		if(set1.contains(name)) {
			System.out.println("해당 이름이 존재합니다.");
		}
		else {
			set1.add(name);
			System.out.println("\n" + name + "이 입력되었습니다.");
		}
		
		// set1에 특정 요소 삭제
		set1.remove("임꺽정");
		
		// set1 비우기
		set1.clear();
		
		if(set2.isEmpty()) {	// set2가 비어 있는지 확인
			System.out.println("set2 가 비어있습니다.");
		}
		else {
			System.out.println("set2의 요소의 수 : " + set2.size());
		}
		
		Set<Integer> set3 = new TreeSet<Integer>(Arrays.asList(9,3,4,6,8,7,6));
		System.out.println(set3);
		
		// Set의 순회1 : 향상된 for문
		System.out.println("\n향상된 for문에 의한 순회");
		for(Integer i : set3) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		// Set의 순회2 : Iterator에 의한 순회
		Iterator it = set3.iterator();
		System.out.println("\nIterator에 의한 순회");
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
	}
}
