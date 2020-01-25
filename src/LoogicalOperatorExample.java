import java.util.Scanner;
public class LoogicalOperatorExample {

	public static void main(String[] args) {
		// a, e, i, o, u
		char input='a';
		
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine().charAt(0);
		
		if(input=='a' || input=='e'|| input=='i'|| input=='o'|| input=='u') {
			
			System.out.print("vowel");
		}else {
			System.out.print("not vowel");
		}

	}

}
