import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {
	
	public static int calcuenteros (int num1, int num2, char operador) {
		
		int resultado=0;
		
		switch(operador) {
		
		case '+': resultado=num1+num2;
		
		break;
		
		case '-': resultado=num1-num2;
		
		break;
		
		case '*': resultado=num1*num2;
		
		break;
		
		case '/': resultado=num1/num2;
		
		break;
		
		default: System.out.println("Error: operador incorrecto");
		break;
		
		}
		
		return resultado;
		
	}

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		try {
		
		System.out.println("Introduce el primer número:");
		int num1 = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("Introduce el segundo número:");
		int num2 = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("Introduce el operador(+,-,*,/):");
		char operador = keyboard.next().charAt(0);
		
		keyboard.nextLine();
		
		keyboard.close();
		
		System.out.printf("Resultado: %d", calcuenteros(num1, num2, operador));
		
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("Error: Uno de los factores no es un número entero.");
			
		}

	}

}

