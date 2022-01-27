package ch3;

public class TextBlockTest {

		public static String getBlockOfHtml() {
		    return """
		            <html>

		                <body>
		                    <span>example text</span>
		                </body>
		            </html>""";	
	}
		
		public static void main(String[] args) {
			String textBlocks="""
					Hello,
					Hi,
					How r u
					""";
			
			System.out.println(textBlocks);
			System.out.println(getBlockOfHtml());
		}
}
