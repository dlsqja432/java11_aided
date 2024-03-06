package sec2;

public class CharStack {
	private StringBuffer stack;
	
	public CharStack() {
		stack = new StringBuffer();
	}
	
	public CharStack(int capacity) {
		stack = new StringBuffer(capacity);
	}
	
	public void push(char c) {	// 한 글자씩 저장
		stack = stack.append(c);
	}
	
	public char pop() {	// 한 글자씩 가져오기
		char ch = stack.charAt(stack.length()-1);
		stack = stack.deleteCharAt(stack.length()-1);
		return ch;
	}
	
	public char[] list() {	// 문자열을 문자 배열로 변경
		char[] arr = stack.substring(0).toCharArray();
		return arr;
	}
	
	public String toString() {	// 문자 배열을 문자열로 변경
		return this.stack.toString();
	}
}
