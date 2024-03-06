package sec2;

//import java.util.StringTokenizer;

public class StringExam1 {

	public static void main(String[] args) {
		String name1 = "장인범";
		String name2 = new String("엄지훈");
		Integer su1 = 1004;
		String su2 = "1004";
		String su3 = String.valueOf(su1);
		
		System.out.println("su1 equals su2 : " + su1.equals(su2));
		System.out.println("su2 equals su3 : " + su2.equals(su3));
		
		String str = "강범준/박동빈/이성하/조대신/배곤희/권민지";
		String[] names = new String[6];
//		StringTokenizer st = new StringTokenizer(str);
//		for(int i=0; i<names.length; i++) {
//			System.out.println(st.nextToken("/"));
//		}
		names = str.split("/");
		for(String s : names) {
			System.out.println(s);
		}
		
//		String str2 = "";
//		for(String s : names) {
//			str2 = str2.concat(s);
//		}
//		System.out.println(str2);
		
		String str2 = String.join("/", names); // 문자열 합치지
		System.out.println(str2);
		
		String data = "	ivE\'s beaUty grOup\nnewJeans is girlGroup Top	";
		
		char eight = data.charAt(9);	  	  // 10번 째 문자(인덱스가 9인 문자)
		System.out.println("10번째 문자(인덱스가 9인 문자) : " + eight);
		String trimData = data.trim();			  	  // 앞 뒤의 공백을 제거하여 trimData에 저장
		System.out.println("앞 뒤의 공백을 제거 : " + trimData.length()+ "글자, " + trimData);
		int size = data.trim().length();		  	  // 글자수를 size에 저장
		System.out.println("앞 뒤 공백을 제거한 글자 수 : " + size);
		int n = data.indexOf('n');		  	  // 첫번째 n의 글자 위치(인덱스)를 n에 저장
		System.out.println("n의 글자 위치 : " + n);
		int n2 = data.lastIndexOf('n');		  	  // 마지막 n의 글자 위치(인덱스)를 n에 저장
		System.out.println("n의 글자 위치 : " + n2);
		String up = data.toUpperCase();	  	  // 모두 대문자로 변환하여 up에 저장
		System.out.println("모두 대문자로 변환하여 up에 저장 : " + up);
		String down = data.toLowerCase(); 	  // 모두 소문자로 변환하여 down에 저장
		System.out.println("모두 소문자로 변환하여 up에 저장 : " + down);
		String sub1 = data.substring(20, 28); // 공백을 제거하고, 20번째 글자 부터 27번째만 추출하여 sub1에 저장
		System.out.println("공백을 제거하고, 20번째 글자 부터 27번째만 추출하여 sub1에 저장 : " + sub1);
		String sub2 = data.replace("newJeans", "Kepler"); // newJeans의 단어를 kepler로 변경하여 sub2에 저장
		System.out.println("newJeans의 단어를 kepler로 변경하여 sub2에 저장 : " + sub2);
		byte[] girl = data.trim().getBytes(); 		// 문자열을 girl 문자배열로 변환하여 저장
		System.out.println(girl.length);
		for(byte b : girl) {
			System.out.print((char)b);
		}
		
		String girlgroup = data.substring(data.lastIndexOf('g'), data.lastIndexOf('g') + 9);
		System.out.println("\ngirlgroup : " + girlgroup + " " + sub1);
		
		// 문자(byte) 배열을 문자열(String)으로 변환 출력
		String str4 = new String(girl);
		System.out.println(str4);
	}

}
