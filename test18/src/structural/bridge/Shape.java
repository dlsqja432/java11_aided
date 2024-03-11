package structural.bridge;

public abstract class Shape {
	protected Color color;	// Composition
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public abstract void applyColor();
}
