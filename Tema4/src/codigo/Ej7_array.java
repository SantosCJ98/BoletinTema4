package codigo;

import static generarcarta.GenerarCarta2.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej7_array {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		
		
		try {
		
		int jugador=1;
		
		int puntosJ1=0;
		
		int puntosJ2=0;
		
		double dineroJ1;
		
		double dineroJ2;
		
		int numcarta;
		
		int valorcarta;
		
		int barajaJ1=0, barajaJ2=0;
		
		double apuesta=0;
		
		double maximaapuesta=0;
		
		int salir=0;
		
		int ronda=1;
		
		boolean ases = false;
		
		
		
		System.out.println("Bienvenido al Juego del BlackJack. (Pulsa 0 en cualquier momento para salir)");
		
		
		do {
			  
		
			
			dineroJ1=100;
			dineroJ2=100;
			
			System.out.printf("Dinero Jugador 1: %.2f €\nDinero Jugador 2: %.2f €\n", dineroJ1, dineroJ2);
		
		do {
			
			
		
		
	do {
		
		
			
			maximaapuesta = Math.min(dineroJ1, dineroJ2)/2;
			
			System.out.printf("Pódeis apostar como máximo %.2f €\n", maximaapuesta);
		
		System.out.println("¿Cuánto vais a apostar?");
		
		apuesta = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		if (apuesta == 0) {
			
			System.exit(0);
		}
		
		} while (apuesta > maximaapuesta);
	
	System.out.println("RONDA " + ronda);
	
	
	boolean sincartas = false;
	
		puntosJ1=0;
	
		puntosJ2=0;
		
		 int n = 52; 
		 
		 int [] miarray = new int [n];
		   
		  
		  int j=n-1;
		  
		  
		  for (int i = 0; i < n; i++) {
			  
		   int aux = generarcarta(0);
		   
		   miarray[i] = aux;
		   
		  }

		
		for (int i1 = 0; i1 < n; i1++) {
			
		   for (int i2 = 0; i2 < n; i2++) {
			   
		    if (miarray[i1] == miarray[i2] && i1 != i2) {
		    	
		     int aux = generarcarta(0);
		     
		     miarray[i1]=aux;
		     
		     i1=0;
		     
		    }
		   
		   }
		   
		  }
		
		for (jugador=1; jugador<=2; jugador++) {
			
			int res2=0;
			
			ases = false;
			
			System.out.println("Turno del Jugador " + jugador);
			
			if (sincartas == false) {
			
			System.out.println("Se entregarán 2 cartas:");
			
			for (int i=0; i < 2 && sincartas == false; i++) {
				
				numcarta=miarray[j];
				
				valorcarta=valorcarta(numcarta);
				
				System.out.println(cadenacarta(numcarta));
				
				if (jugador == 1) {
					
					barajaJ1++;
					
					puntosJ1+=valorcarta;
					
					if ((numcarta == 1 || numcarta == 14 || numcarta == 27 || numcarta == 40) && puntosJ1 > 21) {
						
						ases = true;
						
					}
					
					if (ases == true && puntosJ1 > 21) {
						
						puntosJ1-=10;
						
						
						
					}
					
					System.out.println("Puntuación Total: " + puntosJ1);
					
				}
				
				else if (jugador == 2) {
					
					barajaJ2++;
					
					puntosJ2+=valorcarta;
					
					if ((numcarta == 1 || numcarta == 14 || numcarta == 27 || numcarta == 40) && puntosJ2 > 21) {
						
						ases = true;
						
					}
					
					if (ases == true && puntosJ2 > 21) {
						
						puntosJ2-=10;
						
						
						
					}
					
					System.out.println("Puntuación Total: " + puntosJ2);
					
				}
				
				
				
				
				j--;
				
				if (j < 0) {
					
					sincartas = true;
					
				}
				
				
			}
			
			}
			
			else if (sincartas == true) {
				
				System.out.println("Ya no hay mas cartas");
				
			}
			
			while (res2 != 2 && sincartas == false) {
			
			do {
			
			System.out.println("¿Quieres otra carta o te plantas?\n1. Coger carta\n2. Plantarse");
			
			res2 = keyboard.nextInt();
			
			if (res2 == 0) {
				
				System.exit(0);
			}
			
			keyboard.nextLine();
			
			} while ((res2 < 1 || res2 > 2) && sincartas == false);
			
			if (res2 == 1) {
				
				if (sincartas == false) {
				
				numcarta=miarray[j];
				
				valorcarta=valorcarta(numcarta);
				
				System.out.println(cadenacarta(numcarta));
				
				if (jugador == 1) {
					
					barajaJ1++;
					
					puntosJ1+=valorcarta;
					
					if ((numcarta == 1 || numcarta == 14 || numcarta == 27 || numcarta == 40) && puntosJ1 > 21) {
						
						ases = true;
						
					}
					
					if (ases == true && puntosJ1 > 21) {
						
						puntosJ1-=10;
						
					
						
					}
					
					System.out.println("Puntuación Total: " + puntosJ1);
					
				}
				
	if (jugador == 2) {
	
		barajaJ2++;
	
		puntosJ2+=valorcarta;
	
		if ((numcarta == 1 || numcarta == 14 || numcarta == 27 || numcarta == 40) && puntosJ2 > 21) {
		
			ases = true;
		
		}
	
		if (ases == true && puntosJ2 > 21) {
		
		puntosJ2-=10;
		
		
		
		}
	
		System.out.println("Puntuación Total: " + puntosJ2);
	
	}
				
				j--;
				
				if (j < 0) {
					
					sincartas = true;
					
				}
				
				}
				
				if (sincartas == true) {
					
					System.out.println("No hay más cartas. Tienes que pasar");
					
					break;
					
				}
				
			}
			
				
			}
			
			
		}
		
		System.out.println("Puntuación J1: " + puntosJ1);
		System.out.println("Puntuación J2: " + puntosJ2);
		
		
		if (barajaJ1 == 2 && puntosJ1 == 21 && puntosJ2 != 21) {
			
			System.out.println("Gana el Jugador 1 con un BlackJack");
			
			dineroJ1 = dineroJ1 + (apuesta*2);
			
			dineroJ2 = dineroJ2 - (apuesta*2);;
			
		
				
			}
		
		else if (barajaJ2 == 2 && puntosJ2 == 21 && puntosJ1 != 21) {
			
			System.out.println("Gana el Jugador 2 con un BlackJack");
			
			dineroJ2 = dineroJ2 + (apuesta*2);
			
			dineroJ1 = dineroJ1 - (apuesta*2);;
			
			
			
		}
			
		else if ((puntosJ1 > puntosJ2 && puntosJ1 <= 21 && puntosJ2 <= 21) || (puntosJ1 < puntosJ2 && puntosJ1 <= 21 && puntosJ2 > 21)) {
			
			System.out.println("Gana el Jugador 1");
			
			dineroJ1 = dineroJ1 + apuesta;
			
			dineroJ2 = dineroJ2 - apuesta;;
			
			
			
		}
		
		else if ((puntosJ1 < puntosJ2 && puntosJ1 <= 21 && puntosJ2 <= 21) || (puntosJ1 > puntosJ2 && puntosJ1 > 21 && puntosJ2 <= 21)) {
			
			System.out.println("Gana el Jugador 2");
			
			dineroJ1 = dineroJ1 - apuesta;
			
			dineroJ2 = dineroJ2 + apuesta;
			
			
			
	}
			
		
		
		
		
		
		else if ((barajaJ1 == 2 && puntosJ1 == 21 && barajaJ2 == 2 && puntosJ2 == 21) || (puntosJ1 == puntosJ2) || (puntosJ1 > 21 && puntosJ2 > 21)) {
			
			System.out.println("Empate");
			
			
			
		}
		
		System.out.printf("Dinero del Jugador 1: %.2f €\n", dineroJ1);
		System.out.printf("Dinero del Jugador 2: %.2f €\n", dineroJ2);
		
		puntosJ1=0;
		
		puntosJ2=0;
		
		barajaJ1=0;
		
		barajaJ2=0;
		
		ronda++;
		
		} while ((dineroJ1 > 0 && dineroJ2 > 0));
		
		if (dineroJ1 == 0) {
			
			System.out.println("Fin del Juego: Jugador 1 se ha quedado sin dinero");
			
		}
		
		else if (dineroJ2 == 0) {
			
			System.out.println("Fin del Juego: Jugador 2 se ha quedado sin dinero");
			
		}
		
		do {
		
		System.out.println("¿Quieres jugar otra ronda?\n1. Sí\n2. No");
		
		salir = keyboard.nextInt();
		
		keyboard.nextLine();
		
		} while (salir < 1 || salir > 2);
		
		if (salir == 1) {
			
			ronda=1;
			
		}
		
		} while (salir != 2);
		
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("Error: no se ha introducido un número");
			
		}
		
		keyboard.close();
		
	}

}
