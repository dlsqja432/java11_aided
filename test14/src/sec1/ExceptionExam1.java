package sec1;
// 예외(Exception) 처리 : 프로그래밍 로직상 에러가 발생함ㄴ, 그 이후의 처리 문장은 처리 되지 못하고
// 이러한 경우를 예외(Exception)라고 하며, 그렇다면, 다음 문장까지 실행될 수 있도록
// 계속 다음 문장도 처리될 수 있도록 하는 것을 예외 처리 라고 한다.
public class ExceptionExam1 {

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
