package java12classocak19;

public class maxnumber {

	public static void main(String[] args) {
		int numbers[] = {10,35,67,89,45,10,40,60,58,7};
		int maxNumber;
		// largest number - 89
		maxNumber = numbers[0];

		for (int i=0; i<numbers.length; i++) {
			if ( numbers[i] > maxNumber) 
				maxNumber=numbers[i];
						
	}
		System.out.println("Largest number is "+maxNumber);
	}

	}


