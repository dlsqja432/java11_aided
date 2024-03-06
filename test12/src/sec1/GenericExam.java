package sec1;

public class GenericExam {

	public static void main(String[] args) {
		Generic1<Student> s = new Generic1<Student>();
		Student a = new Student("장인범", 29);
		s.setField1(a);
		
		Generic1<Teacher> t = new Generic1<>();
		Teacher b = new Teacher("김대희", 21);
		t.setField1(b);
		
		Generic1<Integer> i = new Generic1<>();
		i.setField1(1004);
		
		Generic1<String> str = new Generic1<>();
		str.setField1("범인장");
	}

}
