package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam2 {

	public static void main(String[] args) {
		
		String[] email = {"dlsqja432", "kbs@naver", "dlsqja432@naver.com", "dd@aa.cc"};
		Pattern p1 = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]+$");	// 이메일 패턴
		
		for(int i=0; i<email.length; i++) {
			Matcher m = p1.matcher(email[i]);
			if(m.matches()) {
				System.out.println("이메일 형식이 맞습니다." + email[i]);
			}
		}
		
		String[] phone = {"010-7123-0546", "012-111-111", "123-4562-7894", "016-113-8546"};
		Pattern p2 = Pattern.compile("^01(?:0|1|[6-9])-\\d{3,4}-\\d{4}$");
		for(int i=0; i<email.length; i++) {
			Matcher m = p2.matcher(phone[i]);
			if(m.matches()) {
				System.out.println("전화번호 형식이 맞습니다." + phone[i]);
			}
		}
		
		String[] jm = {"941207-1234567", "010203-6789012", "3812256-1245678",
				"851019-234567", "780528-1456123"};
		Pattern p3 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}");
		for(int i=0; i<jm.length; i++) {
			Matcher m = p3.matcher(jm[i]);
			if(m.matches()) {
				System.out.println("주민번호 형식이 맞습니다." + jm[i]);
			}
		}
		
		// 우펴번호 패턴 : 100번대(1xx-yy) ~ 700번대(7xx-yy)
		String[] post = {"123-123", "212-34", "816-24", "5434-54", "683-39"};
		Pattern p4 = Pattern.compile("[1-7]\\d{2}\\-\\d{2}");
		for(int i=0; i<post.length; i++) {
			Matcher m = p4.matcher(post[i]);
			if(m.matches()) {
				System.out.println("우편번호 형식이 맞습니다." + post[i]);
			}
		}
		
		// 비밀번호 패턴 : 4~10 글자로 영문 대/소문자와 특수문자(!@#$%^&*?_) 그리고 숫자를 모두 최소 1문자 포함
		// () 반드시 포함
		// ? 한문자
		// =. 이상
		// * 뒤에 나오는 조건으로
		String[] pw = {"abcd1234", "A123a", "1234", "ABCD!1234", "Abc!432"};
		Pattern p5 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$");
		for(int i=0; i<pw.length; i++) {
			Matcher m = p5.matcher(pw[i]);
			if(m.matches()) {
				System.out.println("비밀번호 형식이 맞습니다." + pw[i]);
			}
		}
	}
}
