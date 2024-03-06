package sec2;

import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		List<Notice> nVector = new Vector<>();
		
		// 글쓰기
		nVector.add(new Notice("제목1", "내용1", "작성자1"));
		nVector.add(new Notice("제목2", "내용2", "작성자2"));
		nVector.add(new Notice("제목3", "내용3", "작성자3"));
		nVector.add(new Notice("제목4", "내용4", "작성자4"));
		nVector.add(new Notice("제목5", "내용5", "작성자5"));
		nVector.add(new Notice("제목6", "내용6", "작성자6"));
		
		// 글 목록
		System.out.println("제목\t내용\t작성자");
		for(Notice n : nVector) {
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		System.out.println();
		
		nVector.remove(2); // index 2인 인스턴스 제거 -> 글 제거
		Notice no = new Notice("제목7", "내용7", "작성자7");
		nVector.set(3, no); // 중간에 삽입
		
		for(Notice n : nVector) {
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		
//		* ArrayList와 Vector의 차이점
//		ArrayList는 내용이 없는 인스턴스의 메모리가 그대로 차지 되고 있으나 Vector는 내용이 없으면,
//		메모리에서 자동 제거된다.
	}
}
