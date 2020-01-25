import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {
		int num1=10, num2=20, choice;
		
		System.out.println("Please enter operation to perform");
		System.out.println("1 for add");
		System.out.println("2 for sub");
		System.out.println("3 for mul");
		System.out.println("4 for div");

		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		switch (choice) {
		case 1 :
			System.out.println("Addition" + num1 + num2);
			break;
		case 2 :
			System.out.println("sub" + (num1 - num2));
			break;
		case 3 :
			System.out.println("mul" + num1 * num2);
			break;
		case 4 :
			System.out.println("div" + num1 / num2);
			break;	
		}
		System.out.println("end of switch");
		defalt:
			System.out.println(" Please enter number between 1 to 4 only");
	}

}
