package behavioral.iterator;

import java.util.Iterator;

// Iterator Pattern : 컬렉션의 구현은 노출시키지 않고 요소들에 접근할 수 있는 패턴
public class IteratorPattern {

	public static void main(String[] args) {
		GoatThread goats = new GoatThread();	// 0~29
		goats.addGoat();
		goats.addGoat();
		goats.removeGoat();
		goats.addGoat();
		goats.addGoat();
		Iterator<Integer> goatIter = goats.createIterator();
		while(goatIter.hasNext()) {
			int key = goatIter.next();
			Goat goat = goats.GOATS.get(key);
			System.out.println(key);
			goat.sound();
		}
	}
}
