package java15ocak23;

public class example4 {

	public static void main(String[] args) {
		
         int numbers[][] =  { {1, 2, 3},
        		              {4, 5, 6},
        		              {7, 8, 9}
         };
         for (int i=0; i< numbers.length; i++) {
        	 for (int j=0; j<numbers[i].length; j++) {
        		 System.out.println(numbers[i][j]+ " ");
        	 }
        	 System.out.println();
         }
         
       }

	}


