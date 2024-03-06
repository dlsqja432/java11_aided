package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// Class 타입의 List Stream 방식 활용
class Visitor {
	private String name;
	private int age;
	private int price;
	
	public Visitor() {}
	
	public Visitor(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Visitor [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
}

public class StreamExam4 {

	public static void main(String[] args) {
		List<Visitor> vList = new ArrayList<>();
		Visitor v1 = new Visitor("장인범", 29, 1000);
		Visitor v2 = new Visitor("장준식", 32, 2500);
		Visitor v3 = new Visitor("킴수정", 35, 1500);
		Visitor v4 = new Visitor("풍월량", 22, 500);
		Visitor v5 = new Visitor("이원만", 38, 100);
		
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		
		Stream<Visitor> vStream = vList.stream();
		System.out.println("객체 순회");
		vList.stream().forEach(visitor -> System.out.println(visitor.toString()));
		System.out.println("이름만 추출");
		vList.stream().map(visitor -> visitor.getName()).forEach(s -> System.out.println(s));
		System.out.println("나이가 30이상인 사람의 이름을 정렬하여 출력");
		vList.stream().filter(visitor -> visitor.getAge()>=30)
		.map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
	}
}
