package java14class22ocak;

public class StringExample {

	public static void main(String[] args) {
		System.out.println("=====Compare=====");
		
		String str8 = "Amazon";
		String str9 = "SprintQA";
		String str10 = "Amazon";
		
		
		 System.out.println(str8.compareTo(str9));
		 System.out.println(str9.compareTo(str8));
		 System.out.println(str8.compareTo(str10));
		 
		 System.out.println("=====Split=====");
		 
		 String str11 = "Welcome-to-SprintQA";
		 String str12 = "Welcome to%5! This is Chirag from %5 We are going to learn automationQA";
		 
		 String[] words = str11.split("-");
		 System.out.println(words[0]);
		 
		 // count number of the words inside the sentence
		 String[] wordss = str12.split("");
		 System.out.println(wordss[19]);
		 
		 
		 
		 
		 
	}

}
