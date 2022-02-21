package ch06;

public class GenericPrinter<T> { // <> 안에다가, 내가 나중에 이 클래스를 쓸 때 자료형을 아무거나 넣어주면 된다!
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
