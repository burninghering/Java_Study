package ch07;

public class GenericPrinter<T extends Material> { //extends를 함으로써 T에 제한을 둔다. 
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material=material;
	}
	
	public String toString() {
		return material.toString();
	}
}
