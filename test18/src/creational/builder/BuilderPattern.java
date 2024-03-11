package creational.builder;
// Builder Pattern : 멤버 필드와 같은 구성원을 하나 하나 쌓아 올려 객체를 생성하는 패턴
class Student {
	private int no;
	private String name = "홍길동";
	private int point = 0;
	private String phoneNumber = "010-1234-5678";
	
	public Student (int no, String name, int point, String phoneNumber) {
		this.no = no;
		this.name = name;
		this.point = point;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber + "]";
	}
}

class StudentBuilder {
	private int no;
	private String name;
	private int point;
	private String phoneNumber;

	public StudentBuilder no(int no) {
		this.no = no;
		return this;
	}
	
	public StudentBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public StudentBuilder point(int point) {
		this.point = point;
		return this;
	}
	
	public StudentBuilder phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public Student build() {
		return new Student(no, name, point, phoneNumber);
	}

	@Override
	public String toString() {
		return "StudentBuilder [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}

public class BuilderPattern {

	public static void main(String[] args) {
		// StudentBuilder를 이용한 Student 객체 생성 -> 해당 멤버를 하나 씩 메소드 체이닝 방법에 의해 추가하는 객체 생성 방식
		Student st = new StudentBuilder()
				.no(1001)
				.name("장인범")
				.point(80)
				.phoneNumber("010-1111-2222")
				.build();
		System.out.println(st.toString());
		
		Student st2 = new StudentBuilder()
				.no(1002)
				.point(90)
				.build();
		System.out.println(st2.toString());
		
		Student st3 = new Student(1003, "김기태", 70, "010-2222-3333");	// 생성자에 의한 Student 객체 생성
		System.out.println(st3.toString());
	}
}
