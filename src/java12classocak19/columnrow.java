package java12classocak19;

public class columnrow {

	public static void main(String[] args) {
		int numbers[][] = {{10,20,30,10},{40,50,60,40},{70,80,90,70}};
		// numbers.length - number of rows
		//for(int i=0; i<)
		//System.out.println(numbers.length);
		//System.out.println(numbers[1].length);
		for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}

}
