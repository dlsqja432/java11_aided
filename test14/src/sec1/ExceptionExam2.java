package sec1;
// NullPointerException : 변수가 null인 상태에서 해당 변수에 접근하려고 할 때 발생
public class ExceptionExam2 {

	public static void main(String[] args) {
		String name = null;
		// 실제 처리할 문장(try)이 예외가 발생하면, 예외처리 문장(catch)을 실행
		// 다중 catch 문장 
		try {
			// 실제 처리할 문장
			System.out.println(name.toString());	// 처리할 문장
			System.out.println("정상처리 문장 아래");
		} catch(NullPointerException e) {
			e.printStackTrace();
			name = "장인범";
			System.out.println(name + "\n예외처리 문장 아래");
		} catch(Exception e) {
			System.out.println("정체를 알 수 없는 예외 발생");
		}
	}
}
