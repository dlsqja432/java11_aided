package sec4;

public class ClassExam {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person p1 = new Person("장인범", 29);
		// p1의 소속 패키지 이름과 클래스명을 출력하라
		System.out.println("클래스명 : " + p1.getClass().getName());
		
		Class<Person> p2 = Person.class;
		System.out.println("클래스명 : " + p2.getName());
		
		// 라이브러리 로딩할 때 많이쓰니 알아두기
		Class p3 = Class.forName("sec4.Person"); // 클래스를 동적로딩
		System.out.println("클래스명 : " + p3.getName());
		
		// 이건 이제 안씀
		Person p4 = (Person) p3.newInstance();
		p4.setName("장인범");
		p4.setAge(29);
		System.out.println("인스턴스 정보 : " + p4);
		System.out.println("클래스명 : " + p4.getClass().getName());
		//https://github.com/kkt09072
	}

}
