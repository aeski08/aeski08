package java15ocak23;

public class exampl {

	public static void main(String[] args) {
		
		int num1 = 15;
		
		for(int i=2; i <=num1-1; i++) {
			if (num1%i==0) {
				System.out.println("Not prime");
				break;
			} else {
				System.out.println("Number is prime");
			}
		}

	}

}
