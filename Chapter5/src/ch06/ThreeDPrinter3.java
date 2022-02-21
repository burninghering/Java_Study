package ch06;

public class ThreeDPrinter3 { //예전에는 기능은 다 똑같은데 자료형만 다를 경우 
	private Object material; //Object(최상위 클래스)로 선언헤서 모든 자료형을 Object로 변환했다.

	public Object getMaterial() { //이 프린터는 재료가 무엇이던지 가능!
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}
	
}
