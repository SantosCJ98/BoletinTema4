import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {
	
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
		
		default: System.out.print("");
		break;
		
		}
		
		return resultado;
		
	}
	
	public static double calcudecimales (double num1, double num2, char operador) {
		
		double resultado=0;
		
		switch(operador) {
		
		case '+': resultado=num1+num2;
		
		break;
		
		case '-': resultado=num1-num2;
		
		break;
		
		case '*': resultado=num1*num2;
		
		break;
		
		case '/': resultado=num1/num2;
		
		break;
		
		default: System.out.print("");
		break;
		
		}
		
		return resultado;
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
	
		try {
			
		
		System.out.println("Introduce el primer número:");
		double num1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Introduce el segundo número:");
		double num2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
	
		
		System.out.println("Introduce el operador(+,-,*,/):");
		char operador = keyboard.next().charAt(0);
		
		keyboard.nextLine();
		
		if (operador != '+' && operador != '-' && operador != '*' && operador != '/') {
			
			System.out.println("Error: operador incorrecto");
			
		}
		
		else {
		
		if (num1 == Math.floor(num1) && num2 == Math.floor(num2)) {
			
			System.out.printf("Resultado: %d", calcuenteros((int)num1, (int)num2, operador));
			
		}
		
		else if (num1 != Math.floor(num1) || num2 != Math.floor(num2)) {
			
			System.out.printf("Resultado: %f", Math.round(calcudecimales(num1, num2, operador)));
			
		}
		
		}
		
		keyboard.close();
		
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("Error: el valor introducido no es un número.");
			
		}
		
		catch (ArithmeticException | IllegalFormatConversionException e) {
			
			System.out.println("Error. No se puede dividir por 0");
			
		}
		
		

	}

}

