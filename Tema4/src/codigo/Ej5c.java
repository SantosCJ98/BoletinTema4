package codigo;
public class Ej5c {

	public static void main(String[] args) {
		
		
		
		int num=1;
		
			
		while (num <= 10000) {
		
			int suma=0;
			
		for (int i=1; i < num; i++) {
			
			if (num%i == 0) {
				
			suma+=i;
				
			}
			
		}
		
		if (suma == num) {
			
			System.out.println(num +  " es perfecto");
			
			for (int j = 1; j < num; j++) {
				
				if (num%j == 0) {
					
					System.out.print(j + " ");
					
				}
				
			}
			
			System.out.println();
			
		}
		
		num++;
		
			
		}

	}

}
