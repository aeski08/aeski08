package java13class21ocak;
public class StringManipulation {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str3 = "Hello";
		String str2 = new String("Hello");
		String str4 = new String("Hello");
		
		String actualWebTitle = "Welcome to Ebay";
		String expectedTitle = "Ebay";
		
		String strWithUpperCase = "WELCOME TO EBAY";
		String strWithLowerCase = "ebay";
		
		//System.out.println(str1==str3);
		//System.out.println(str2==str4);
		
		//System.out.println(expectedTitle.equals(actualWebTitle));
		//System.out.println(expectedTitle.equalsIgnoreCase(actualWebTitle));
		//System.out.println(expectedTitle.length());
		System.out.println(expectedTitle.contains(actualWebTitle));
		
		System.out.println(actualWebTitle.toUpperCase());
		System.out.println(actualWebTitle.toLowerCase());
		
		
	}
}
