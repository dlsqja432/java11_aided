package sec1;
class Outer3 {	// 외부 클래스
	// 익명의 내부 클래스를 선언시에는 Runnable 로 구현해야 한다.
	Runnable getRunnable(int i) {	// Runnable은 인터페이스 이므로 인스턴스 생성시 기본 메소드인 run() 메소드의 구현 내용을 기술하여 생성해야함.
		int num = 100;	// 지역 변수
		
		return new Runnable() {
			@Override
			public void run() {
				System.out.println(i);	// i => 매개 변수
				System.out.println(num);// num => 지역변수
			}
		};
	}
	// 익명의 실행 인스턴스(객체)를 Runnable 생성
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable로 구현된 익명의 내부 클래스");
		}
	};
}
public class AnonymousInnerExam {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.getRunnable(500);	// 오류는 없지만 Runnable이 만들어지지 않아 실행이 되지 않음.
		out.runner.run();
		
		Runnable runAble = out.getRunnable(500);	// 외부 클래스의 내부 클래스 없이 생성된 인스턴스(runAble)는 Runnable 로 선언함
		runAble.run();
	}
}
