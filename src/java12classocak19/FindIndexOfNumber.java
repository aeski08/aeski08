package java12classocak19;

public class FindIndexOfNumber {

	public static void main(String[] args) {
		int numbers[] = {10,35,67,89,45,65,40,60,58,10};
		int targetNumber = 10;
		
		
		for (int i=0; i<numbers.length; i++) {
			if (targetNumber==numbers[i]) {
				System.out.println(i);
				//break olursa sadece birini yazar
			}
		}

	}

}
