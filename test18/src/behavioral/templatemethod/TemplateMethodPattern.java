package behavioral.templatemethod;
// Template Method Pattern : 공통 메소드를 상위 클래스에서 정의, 세부 사항은 하위 클래스에서 구현
public class TemplateMethodPattern {

	public static void main(String[] args) {
		HouseTemplate house1 = new WoodenHouse();
		HouseTemplate house2 = new GlassHouse();
		
		house1.buildHouse();
		System.out.println();
		house2.buildHouse();
	}

}
