package creational.abstractfactory;
// Factory 추상 클래스 : 추상 클래스를 만드는 공장(Factory) 역할을 하는 클래스
// 구현부에 신경쓰지 않고, 추상체(인터페이스)만 만드는 패턴
public abstract class Factory {
	
	public static Factory getFactory(String classname) {	// 정적 메소드
		Factory factory = null;
		try {
			factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 " + classname + "이 발견되지 않았습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}
	
	// 추상 메소드
	public abstract Link createLink(String caption, String url);	
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
}
