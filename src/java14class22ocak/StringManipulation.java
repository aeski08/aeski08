package java14class22ocak;

public class StringManipulation {

	public static void main(String[] args) {
		
		String expectedTitle = "Welcome to SprintQA";
		System.out.println((str1.trim().equals(expectedTitle)));
		
		System.out.println("=====Replace=====");
        
		String str2 +"I am an Automation Enginner";
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("=====IndexOf=====");
		
		String str4 + "Welcome to SprintQA! This is Chirag from Sprint";
		String str5 "Welcome to SprintQA! This is Chirag from SprintQa  We are going to learn AutomationQA";
		System.out.println(str4.indexOf("QA"));
		System.out.println(str4.lastIndexOf("QA"));
		System.out.println(str5.indexOf("QA", str5.indexOf("QA")+1));
		
		System.out.println("=====SubString=====");
		String str6 = "Welcome to SprintQA";
		String str7 = "Welcome to SprintQA! This is Chirag from SprintQA We are going to learn AutomationQA";
		System.out.println(str7.substring(11,20));
		
		String companyName = "SprintQA!";
		
		String title = "Welcome to%5! This is Chirag from %5 We are going to learn automationQA";
		
		System.out.println(String.format(title,  companyName,companyName));
		
		
		
		
				
			
	}

}
