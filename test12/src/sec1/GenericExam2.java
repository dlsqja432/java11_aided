package sec1;

class StudentMap<K, V> {
	private K key;
	private V value;
	
	public StudentMap() {}
	
	public StudentMap(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
}

public class GenericExam2 {

	public static void main(String[] args) {
		StudentMap<Integer, String> s1 = new StudentMap<>(1,"장인범");
		StudentMap<Integer, String> s2 = new StudentMap<>(2,"인범장");
		StudentMap<Integer, String> s3 = new StudentMap<>(3,"범인장");
		StudentMap<Integer, String> s4 = new StudentMap<>(4,"장범인");
		
		StudentMap<String, Integer> s5 = new StudentMap<>("엄지훈",50);
		StudentMap<String, Integer> s6 = new StudentMap<>("지훈엄",60);
		
		Student st1 = new Student("김대희", 26);
		StudentMap<Student, Integer> s7 = new StudentMap<>(st1,60);
	}

}












