package codigo;
import java.util.Scanner;

public class Ej3b {

	public static void main(String[] args) {
		int divisores=0;
		
		int num=1;
		
		while (num <= 10000) {
			
			divisores=0;
		
		for (int i=1; i<=num; i++) {
			
			if (num % i == 0) {
				
				divisores++;
				
			}
			
			if (divisores > 2) {
				
				break;
			}
			
		}
		
		if (divisores == 2) {
			
			System.out.println(num);
			
		}
		
		num++;
		
		}
		

	}
	
}


