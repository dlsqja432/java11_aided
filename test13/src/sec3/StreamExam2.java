package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// String 타입의 List Stream 방식 활용
// stream.메소드();
public class StreamExam2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("워로드");
		lst.add("실린");
		lst.add("데런");
		lst.add("쿠크세이튼");
		lst.add("아브렐슈드");
		lst.add("카멘");
		
		// ArrayList의 Stream화
		Stream<String> stream = lst.stream();
		System.out.println("정렬 전");
		stream.forEach(s -> System.out.print(s+ " "));
		System.out.println("\n\n정렬 후");
		lst.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println("\n");
		
		// 요소의 수
		int cnt = (int) lst.stream().count();
		System.out.println("요소의 수 : " + cnt);
	}
}
