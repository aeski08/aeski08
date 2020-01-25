package java12classocak19;

import java.util.Scanner;

public class poznegnumber {

	public static void main(String[] args) {
		int numbers[] = new int[10];
		int positiveSum = 0, negativeSum = 0;;

		  Scanner sc = new Scanner(System.in);
		  
		  for(int i=0; i<numbers.length; i++) {
			  numbers[i] = sc.nextInt();
		  }
		 for(int i=0; i<numbers.length; i++) {
		if(numbers[i]>0) {
			positiveSum = positiveSum + numbers[i];
		} else {
			negativeSum = negativeSum + numbers[i];
		}
		 }
		 System.out.println("Sum of positive number: " + positiveSum);
		 System.out.println("Sum of negative number: " + negativeSum);
	}

}
