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
		
		  for(int i=2; i <= num; i++){

	            while(num % i==0){
	            	
	                num=num/i;
	                
	                System.out.print(i + " ");
	            }
		  }
		
		}
		
		catch (Exception e) {
			
			System.out.println("Error: No has introducido un número.");
			
		}

	}

}
