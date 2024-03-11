package creational.factorymethod;
// Product 추상 클래스
public class IDCard extends Product {
	private String owner;
	
	public IDCard(String owner) {
		System.out.println(owner + "의 카드를 만듭니다.");
		this.owner = owner;
	}
	
	@Override
	public void use() {
		System.out.println(owner + "의 카드를 사용합니다.");
	}
	
	public String getOwner() {
		return this.owner;
	}
}