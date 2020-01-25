package java15ocak23;

import java.util.Arrays;

public class example3 {

	public static void main(String[] args) {
		int numbers[] = {14, 56, 37, 0, 23, 9, 2, 80, 67};
		// small to largest
		
		
		
		int min = numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if (numbers[i]< min) {
				min = numbers[i];
			}
		}
		System.out.println(min);

	}

}
