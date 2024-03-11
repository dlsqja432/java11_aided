package creational.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		Singleton ins1 = Singleton.getInstance(1);
		Singleton ins2 = Singleton.getInstance(2);
		Singleton ins3 = Singleton.getInstance(3);
		ins1.print();
		ins2.print();
		ins3.print();
		if(ins1 == ins2 && ins1 == ins3) {
			System.out.println("하나의 객체 입니다.");
		}
		else {
			System.out.println("서로 다른 객체 입니다.");
		}
	}
}
