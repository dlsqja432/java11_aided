package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
// Map : HashMap, Hashtable, TreeMap, Properties => 키와 값 분리시에는 entry 또는 element 단위로 Iterator 나 Enumeration 이 필요하다.
public class MapExam {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable<>();
		Map<Integer, String> map3 = new TreeMap<>();
		Properties map4 = new Properties();
		
		map1.put("Kim", 90);	// 추가
		map1.put("lee", 100);
		map1.put("park", 80);
		map1.put("kang", 85);
		map1.put("kwon", 70);
		System.out.println(map1);
		System.out.println("park : " + map1.get("park")); // 개별 요소 접근 시 인덱스가 아니라 키 값 필요
		// 맵 순회1 : Iterator(분리자)에 의한 접근
		// keys = {kim,lee,park,kang,kwon}
		Iterator<String> keys = map1.keySet().iterator(); // map의 keyset(키모음)이 하나의 요소로 분리됨
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + "=" + map1.get(key));
		}
		
		// 맵 순회2 : entrySet(키와 값의 하나의 쌍 => entry)에 의한 접근
		for(Map.Entry<String, Integer> en : map1.entrySet()) {
			String key = en.getKey();
			Integer value = en.getValue();
			System.out.println(key + " : " + value);
		}
		
		// 맵 순회3 : keyset에 의한 접근
		System.out.println("KeySet에 의한 순회");
		for(String key : map1.keySet()) {
			System.out.println(key + " : " + map1.get(key));
		}
		
		System.out.println();
		if(map1.containsKey("kang")) {
			System.out.println("Kang : " + map1.get("kang"));
		}
		else {
			System.out.println("키가 kang인 요소는 존재하지 않습니다.");
		}
		
		if(map1.containsValue(100)) {
			System.out.println("100점 만점자가 존재합니다.");
		}
		else {
			System.out.println("100점 만점자가 없습니다.");
		}
		
		map2.put("key1", "1코스");	// 키는 중복될 수 없음
		map2.put("key2", "2코스");
		map2.put("key3", "3코스");
		map2.put("key1", "2코스");
		map2.put("key2", "3코스");
		map2.put("key6", "1코스");
		System.out.println(map2);
		
		map2.remove("key2");
		System.out.println("***** 편집 후 *****");
		System.out.println(map2);
		
		map2.clear();
		System.out.println("***** 비우기 후 *****");
		System.out.println(map2);
		
		//배열의 값을 TreeMap에 대입
		for(int i=0; i<=9; i++) {
			map3.put(i, "이름"+i);
		}
		System.out.println("인원 수 : " + map3.size());
		for(Integer i : map3.keySet()) {
			int key = i;
			String value = map3.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// Properties의 키(필드이름)과 값은 모두 문자열로 취급된다.
		map4.setProperty("name", "장인범");
		map4.setProperty("age", "29");
		map4.setProperty("height", "173.6");
		map4.setProperty("kor", "100");
		map4.setProperty("eng", "70");
		map4.setProperty("mat", "100");
		System.out.println("이름 : " + map4.getProperty("name"));
	}
}
