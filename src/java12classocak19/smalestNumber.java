package java12classocak19;

public class smalestNumber {

	public static void main(String[] args) {
		int numbers[] = {10,35,67,89,45,10,40,60,58,7};
		int smalestNumber=0;
        int minNumber;
        
		for (int i=1; i<numbers.length; i++) {
			if (smalestNumber > numbers[i]) 
				smalestNumber=numbers[i];
						
	}
		System.out.println("Smalest number is "+smalestNumber);
		
		minNumber = numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]<minNumber) {
				minNumber=numbers[i];
			}
		}
		System.out.println("Smalest number is "+minNumber);
	}

}
