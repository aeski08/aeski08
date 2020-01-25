package java12classocak19;

public class largestNumber {

	public static void main(String[] args) {
		int numbers[] = {10,35,67,89,45,10,40,60,58,7};
		int largestNumber=0;
		// largest number - 89

		for (int i=0; i<numbers.length; i++) {
			if (largestNumber < numbers[i]) 
				largestNumber=numbers[i];
						
	}
		System.out.println("Largest number is "+largestNumber);
	}
}
