package sec1;
//extends Object 구절이 생략되어 있음. 그러므로 모든 클래스는 Object 클래스를 시조 클래스로 갖는다.
public class Student extends Object { 
	private int sno;
	String name;
	
	public Student() {}
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// 객체 복제시에는 반드시 clone()을 오버라이딩 해야함.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student clone = new Student(); // 해당 객체 생성
		clone.name = this.name;		   // 새로 생성된 객체에 모든 필드 값을 넘기기
		clone.sno = this.sno;
		return clone;
	}
	// equals 메소드를 값 비교해주는 메소드로 오버라이딩 한 것
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student su1 = (Student) obj;
			if(su1.name == this.name && su1.sno == this.sno) {
				return true;
			}
			else return false;
		}
		else return false;
	}
}
