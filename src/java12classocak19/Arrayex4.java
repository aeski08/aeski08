package java12classocak19;

public class Arrayex4 {

	public static void main(String[] args) {
		int numbers[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int sum=0;
		
		for (int i=0; i<numbers.length; i++) {
		for(int j=0; j<numbers.length; j++) {
				sum = sum + numbers[i][j];
			}
			System.out.println("Sum of row "+i+ "  ="+ sum);
		}
	}

}
