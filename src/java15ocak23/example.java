package java15ocak23;

public class example {

	public static void main(String[] args) {
		
		int num1 = 13;
        boolean flag = false;
        
        
	for(int i=2; i<=num1-1; i++) {
		if(num1==2) {
			flag = true;
			break;
		}
		if(num1 ==1 || num1% i ==0) {
			flag = true;
			System.out.println("This is not prime number");
			break;
		}
	}
	
	    if(flag==false) {
	    	System.out.println("This is prime number");
	}
  }
}