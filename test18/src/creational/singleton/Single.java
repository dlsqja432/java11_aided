package creational.singleton;

public class Single {
	private static Single instance;
	
	public Single() {}
	
	public static Single getInstance() {
		if(instance == null) {
			instance = new Single();
		}
		return instance;
	}
}
