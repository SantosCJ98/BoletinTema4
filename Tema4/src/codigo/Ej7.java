package codigo;

import java.util.InputMismatchException;
import java.util.Scanner;

import static generarcarta.GenerarCarta.*;

public class Ej7 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		try {
		
		int jugador=1;
		
		int puntosJ1=0;
		
		int puntosJ2=0;
		
		double dineroJ1;
		
		double dineroJ2;
		
		int numcarta, palo;
		
		int valorcarta;
		
		int barajaJ1=0, barajaJ2=0;
		
		double apuesta=0;
		
		double maximaapuesta=0;
		
		int salir=0;
		
		int ronda=1;
		
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
	
		boolean as = false;
	
		puntosJ1=0;
	
		puntosJ2=0;
		
		for (jugador=1; jugador<=2; jugador++) {
			
			int res2=0;
			
			as = false;
			
			System.out.println("Turno del Jugador " + jugador);
			System.out.println("Se entregarán 2 cartas:");
			
			for (int i=0; i < 2; i++) {
				
				numcarta=carta(0);
				
				palo=palo(0);
				
				valorcarta=valor_carta(numcarta);
				
				System.out.println(cadena_carta(numcarta, palo));
				
				if (jugador == 1) {
					
					barajaJ1++;
					
					puntosJ1+=valorcarta;
					
					if ((numcarta == 1 || numcarta == 14 || numcarta == 27 || numcarta == 40) && puntosJ1 > 21) {
						
						as = true;
						
					}
					
					if (as == true && puntosJ1 > 21) {
						
						puntosJ1-=10;
						
						as = false;
						
					}
					
					System.out.println("Puntuación Total: " + puntosJ1);
					
				}
				
				
				if (jugador == 2) {
					
					barajaJ2++;
					
					puntosJ2+=valorcarta;
					
					if (numcarta == 1 && puntosJ2 > 21) {
						
						as = true;
						
					}
					
					if (as == true && puntosJ2 > 21) {
						
						puntosJ2-=10;
						
						as = false;
						
					}
					
					System.out.println("Puntuación Total: " + puntosJ2);
					
				}
				
				
				
				
				

				
				
			}
			
			while (res2 != 2) {
			
			do {
			
			System.out.println("¿Quieres otra carta o te plantas?\n1. Coger carta\n2. Plantarse");
			
			res2 = keyboard.nextInt();
			
			if (res2 == 0) {
				
				System.exit(0);
			}
			
			keyboard.nextLine();
			
			} while (res2 < 1 || res2 > 2);
			
			if (res2 == 1) {
				
				numcarta=carta(0);
				
				palo=palo(0);
				
				valorcarta=valor_carta(numcarta);
				
				System.out.println(cadena_carta(numcarta, palo));
			
				
				if (jugador == 1) {
					
					barajaJ1++;
					
					puntosJ1+=valorcarta;
					
					if (numcarta == 1 && puntosJ1 > 21) {
						
						as = true;
						
					}
					
					if (as == true && puntosJ1 > 21) {
						
						puntosJ1-=10;
						
						as = false;
						
					}
					
					System.out.println("Puntuación Total: " + puntosJ1);
					
				}
				
				if (jugador == 2) {
					
					barajaJ2++;
					
					puntosJ2+=valorcarta;
					
					if (numcarta == 1 && puntosJ2 > 21) {
						
						as = true;
						
					}
					
					if (as == true && puntosJ2 > 21) {
						
						puntosJ2-=10;
						
						as = false;
						
					}
					
					System.out.println("Puntuación Total: " + puntosJ2);
					
				}
				
			}
			
				
			}
			
			
		}
		
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
		
		} while (dineroJ1 > 0 && dineroJ2 > 0);
		
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
