package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // Powder가 Material에서 상속을 받지 않으면 오류가 난다 
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
	}

}
