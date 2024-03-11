package creational.singleton;

public class Singleton {
	private static Singleton instance;	// static 멤버 필드는 공유 메모리
	private int msg;
	private Singleton(int msg) {
		this.msg = msg;
	}
	
	public static Singleton getInstance(int msg) {	// static 메소드는 객체 생성 없이 Singleton 인스턴스명 = Singleton.getInstance(정수)로 호출
		if(instance == null) {
			instance = new Singleton(msg);
		}
		return instance;
	}
	
	public void print() {
		System.out.println(msg);
	}
}
