package sec3;

import java.util.HashMap;
import java.util.Map;

// 자료 구조(자료의 논리적인 저장 원리에 따른 구조)
// 1. 단순 구조(Primitive) : 정수, 실수, 문자, 문자열, 논리형
// 2. 선형 구조(Sequence) : 배열(Array), 리스트(List), 스택(Stack), 큐(Queue), 덱(Deque)
// 3. 비 선형 구조(Non-Sequence) : 맵(Map), 트리(Tree), 그래프(Graph), 셋(Set)
public class HashMapExam {

	public static void main(String[] args) {
		//선언 방법
		Map<String, String> map0 = new HashMap<String, String>(); // Map 인터페이스를 활용한 HashMap 생성
		HashMap<String, String> map1 = new HashMap<String, String>(); // HashMap 선언 및 생성 표준식
		HashMap<String, String> map2 = new HashMap<>(); // 생성자의 앞서 선언한인자의 생략이 가능
		HashMap<String, String> map3 = new HashMap<>(map1); // 맵의 복제
		// 배열 개수 지정 -> String[] arr = new String[10];   // 맵의 초기 용량은 기본적으로 16개
		HashMap<String, String> map4 = new HashMap<>(10); // 초기 용량 지정(capacity) - 초기 용량 지정보다 더 많은 데이터를 저장하게 되면, 자동적으로 초기 용량의 배로 증가.
		HashMap<String, String> map5 = new HashMap<>(10, 0.7f); // load factor - 사용 확률 지정
		HashMap<String, String> map6 = new HashMap<>() {{
			put("name","장인범");
		}};
		
		HashMap<Integer, String> fruits = new HashMap<>();
		fruits.put(1, "사과");	// 요소(Entry) 추가
		fruits.put(2, "딸기");
		fruits.put(3, "샤인머스켓");
		fruits.put(4, "망고");
		fruits.put(5, "복숭아");
		fruits.put(6, "키위");
		fruits.put(7, "바나나");
		
		fruits.remove(4);
		System.out.println(fruits);
		
		// fruits.clear(); // HashMap 비우기
		for(Integer i : fruits.keySet()) {
			System.out.println(i + " : " + fruits.get(i));
		}
		
		if(fruits.containsValue("키위")) {
			System.out.println("해당 HashMap에 키위가 존재합니다.");
		}
		else {
			System.out.println("해당 HashMap에 키위가 존재하지 않습니다.");
			fruits.put(8, "키위");
		}
	}

}
