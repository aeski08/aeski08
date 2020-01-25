package DoWhile;
import java.util.Scanner;

public class faktoryel {

	public static void main(String[] args) {
	   
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayiyi giriniz");
		int sayi = scan.nextInt();
		
		int faktoryel =1;
		
		while (sayi >=1) {
		faktoryel = faktoryel * sayi;	
			sayi--;
			//System.out.println("Faktoryel " + faktoryel + " Sayi " + sayi);
			
		}
		System.out.println("Faktoryel " + faktoryel); 
	}

}
