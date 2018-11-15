import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		try {
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce el primer número");
		
		int num1 = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("Introduce el segundo número");
		
		int num2 = keyboard.nextInt();
		
		int a = Math.max(num1, num2);
		
		int b = Math.min(num1, num2);
		
		int aux;
		
		do {
			
			aux = b;
			
			b = a%b;
			
			a = aux;
			
		} while (b != 0);
		
		System.out.println("Resultado: " + aux);
		
		
		
	}
	
	catch (Exception e) {
		
		System.out.println("Error: no has introducido un número");
		
	}
		
	}

}
