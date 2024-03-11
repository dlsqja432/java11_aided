package sec1;

public class SOLIDExam {

	public static void main(String[] args) {
//		SOLID : 객체지향 프로그래밍(OOPS : Object Oriented Programming Software) 의 5가지 설계 원칙
		
//		SRP(Single Responsibility Principle) : 단일 책임의 원칙
//		해당 모듈이 여러 대상 또는 액터들에 대해 책임을 모두 가져서는 안되고, 오로지 하나의 액터에 대해서만 책임을 져야 한다.
		
//		OCP(Open-Closed Principle) : 개방-폐쇄 원칙
//		확장에 대해서는 열려있고, 수정에 대해서는 닫혀있어야 한다.
		
//		LSP(Liskov Substitution Principle) : 리스코프 치환 원칙
//		하위 타입은 상위 타입으로 대체할 수 있어야 한다.
		
//		ISP(Interface Segregation Principle) : 인터페이스 분리 원칙
//		하나의 객체라고 하더라도 목적과 관심사가 다른 경우 각기 다른 인터페이스로 적절하게 분리 해야 한다.
		
//		DIP(Dependency Inversion Principle) : 의존 역전 원칙
//		고수준 모듈은 저수준 모듈의 구현에 의존해서는 안되며, 저수준 모듈이 고수준 모듈에 의존해야 한다.
//		Dependency(의존성) : 모든 필요한 기능 모듈을 처음부터 전부 개발하여 애플리케이션을 만들 수는 없기 때문에
//		개발자는 애플리케이션이 기 만들어진 고수준 모듈에 의존하여 개발할 수 밖에 없는데 이를 의존성이라 한다.
		
//		GoF(Gang of Fout) 패턴 : SOLID의 5가지 객체지향 프로그래밍 설계 원칙에 의해 생겨난 자바의 디자인 패턴으로
//		공통적으로 발생하는 문제를 예방하고, 클래스의 재이용성을 높일 수 있다.
		
		System.out.println("SRP(Single Responsibility Principle) : 단일 책임의 원칙");
		System.out.println("OCP(Open-Closed Principle) : 개방-폐쇄 원칙");
		System.out.println("LSP(Liskov Substitution Principle) : 리스코프 치환 원칙");
		System.out.println("ISP(Interface Segregation Principle) : 인터페이스 분리 원칙");
		System.out.println("DIP(Dependency Inversion Principle) : 의존 역전 원칙");
	}
}
