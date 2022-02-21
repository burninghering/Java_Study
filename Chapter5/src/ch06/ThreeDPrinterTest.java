package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		 
		printer.setMaterial(powder); //Object로 타입을 정해줬을 때 이 때는 오류가 안나지만,
	
		Powder p = (Powder)printer.getMaterial(); //이때는 형 변환을 해줘야 오류가 안난다.
		
	}

}
