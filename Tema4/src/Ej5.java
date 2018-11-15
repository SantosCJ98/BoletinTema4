import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		int suma=0;
		
		Scanner keyboard = new Scanner (System.in);
		
		try {
		
		System.out.println("Introduce un numero");
		
		int num = keyboard.nextInt();
		
		keyboard.nextLine();
		
		keyboard.close();
		
		for (int i=1; i < num; i++) {
			
			if (num%i == 0) {
				
			suma+=i;
				
			}
			
		}
		
		if (suma == num) {
			
			System.out.println("Es perfecto");
			
		}
		
		else if (suma != num) {
			
			System.out.println("No es perfecto");
		}
		
		}
		
		catch (Exception e) {
			
			System.out.println("Error, no has introducido un número.");
			
		}

	}

}
