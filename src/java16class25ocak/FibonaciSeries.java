package java16class25ocak;

public class FibonaciSeries {
// write a program to print fib series till a limit given by user
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 
		int limit = 20, num1 =0, num2=1, sum=0;
		
		// logic to print rest of the numbers
		
		System.out.println(num1);
		System.out.println(num2);
		sum = num1 + num2;
		//System.out.println(sum);
		//num2 = sum;
		//sum = sum + num2;
		//System.out.println(sum);
		//sum = sum + num2;
		//System.out.println(sum);
		//sum = sum + num2;
		//System.out.println(sum);
		while(sum<limit) {
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}		
	}
}
