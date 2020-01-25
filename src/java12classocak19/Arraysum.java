package java12classocak19;

public class Arraysum {
	public static void main(String[] args) {
		int salary[] = {2000, 5000, 1000, 500, 400,700,600,600,1200,900 }, sum=0;
		
		
		for(int empSalary : salary) {
		
			sum = sum + empSalary;
		}
		System.out.println("Total Sallary: "+sum);
		System.out.println("Average Sallary: "+sum/salary.length);
	}

}
