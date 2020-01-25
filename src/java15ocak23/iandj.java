package java15ocak23;

public class iandj {

	public static void main(String[] args) {
		int numbers[] = {14, 0, 23, 9, 2}, min=0, temp=0, indexOfMin=0;
		
		for(int i=0; i<numbers.length-1; i++) {
			
	
		min = numbers[i];
		for(int j=i; j<numbers.length; j++) {
			if (numbers[j]< min) {
				min = numbers[j];
				indexOfMin =j;
			}
		}
	
	temp = numbers[indexOfMin];
	numbers[indexOfMin] = numbers[i];
	numbers[i] = temp;
       }
		  System.out.println(min);
	}
}
