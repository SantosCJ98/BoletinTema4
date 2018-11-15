package codigo;
import java.util.InputMismatchException;
import static codigo.Ej3.esPrimo;


import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int divisores=0;
		
		int num;
		
		Scanner keyboard = new Scanner (System.in);
		
		try {
		
		do {
		
		System.out.println("Introduce un número:");
		
		num = keyboard.nextInt();
		
		keyboard.nextLine();
		
		} while (num <= 1);
		
		keyboard.close();
		
		  for(int i=0; i <= num; i++){
			  
			  if(esPrimo(i) == true) {

	            while(num % i==0){
	            	
	                num=num/i;
	                
	                System.out.print(i + " ");
	            }
		  }
			  
		  }
		
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("Error: No has introducido un número.");
			
		}

	}

	
	public static boolean validnumber (int x) {
		
		if (x > 1) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
	}
}
