package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date date1 = new Date();	// 현재 날짜와 시간 
		
		@SuppressWarnings("deprecation")
		Date date2 = new Date(1996,10,13,7,24,37); // 월은 0부터 시작한다.
		
		@SuppressWarnings("deprecation")
		Date date3 = new Date("Fri, Nov 13 2001 07:24:37 +0900"); // +0900 : RFC 822 규격 타임존
		// 지역 이름(Global/Local) : KST, RFC 822 : +0900
		// 국가 코드 : KR, 언어 코드 : KO => KO_KR
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		System.out.println("*** LocalDate ***");
		
		LocalDate now1 = LocalDate.now();
		System.out.println("날짜 데이터 : " + now1);	// 날짜 데이터"
		
		// 날짜 데이터 => 문자열 데이터
		String now2 = now1.toString();
		System.out.println("날짜 데이터를 문자열 데이터로 변환 : " + now2);
		
		// 문자열 데이터 => 날짜 데이터
		LocalDate now3 = LocalDate.parse(now2);
		System.out.println("문자열 데이터를 날짜 데이터로 변환 : " + now3);
	}
}
