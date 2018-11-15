package codigo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int num=0;
		
		do {
		
		System.out.println("Introduce un número");
		
		try {
		
		num = keyboard.nextInt();
		
		}
		
		catch (InputMismatchException e)  {
			
			System.out.println("Error, no has introducido un número");
			
		}
		
		keyboard.nextLine();
		
		} while (num <= 1);
		
		if (esPrimo(num) == true) {
			
			System.out.println(num + " es primo");
			
			}
		
		else if (esPrimo(num) == false) {
			
			System.out.println(num + " no es primo");
			
			}
		
		else {
			
			System.out.println("Error");
			
		}
		
		keyboard.close();
		
	
	}

	
	public static boolean esPrimo (int x) {
		
		int divisores = 0;
		
		if (x > 1) {
			
			for (int i=1; i<=x; i++) {
				
				if (x % i == 0) {
					
					divisores++;
					
				}
				
				if (divisores > 2) {
					
					break;
				}
				
			}
			
			
		}
		
		if (divisores == 2) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
		
		
	}
	
}



