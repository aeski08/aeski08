package java12classocak19;

public class Arrayex1 {
   //Count total number of odd number and total number of even number inside the array
	public static void main(String[] args) {
		
		int numbers[] = {1,6,45,71,65,34,89,77,55}, oddCount=0, evenCount=0;
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Number of even numbers are " +evenCount);
		System.out.println("Number of odd numbers are " + oddCount);
	}

}
