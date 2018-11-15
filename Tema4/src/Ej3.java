import java.util.Scanner;

public class Ej3 {

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
		
		for (int i=1; i<=num; i++) {
			
			if (num % i == 0) {
				
				divisores++;
				
			}
			
			if (divisores > 2) {
				
				break;
			}
			
		}
		
		if (divisores == 2) {
			
			System.out.println(num  + " es primo.");
			
		}
		
		else if (divisores > 2) {
			
			System.out.println(num  + " no es primo.");
			
		}
		
		}
		
		catch (Exception e) {
			
			System.out.println("Error: No has introducido un número.");
			
		}

	}

}
