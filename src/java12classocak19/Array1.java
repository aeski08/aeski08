package java12classocak19;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
	int salary[] = {2000, 5000, 1000, 500, 400, 700, 600,600,1200,900}; //declaration and i
		
		//for(int i=0; i<=9; i++) {
     	for (int i=0; i<salary.length; i++) {
			sum=sum+salary[i];
		}
			
			System.out.println(sum);
		
	}

}
