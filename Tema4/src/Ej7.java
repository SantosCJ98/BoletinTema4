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
		
		double dineroJ1=100;
		
		double dineroJ2=100;
		
		int numcarta, palo;
		
		int valorcarta;
		
		int barajaJ1=0, barajaJ2=0;
		
		double apuesta=0;
		
		double maximaapuesta=0;
		
		int salir=0;
		
		int ronda=1;
		
		do {
		
		do {
		
		System.out.println("Bienvenido al Juego del BlackJack. (Pulsa 0 en cualquier momento para salir)");
		
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
		
		for (jugador=1; jugador<=2; jugador++) {
			
			int res2=0;
			
			int numases=0;
			
			puntosJ1=0;
			
			puntosJ2=0;
			
			System.out.println("Turno del Jugador " + jugador);
			System.out.println("Se entregarán 2 cartas:");
			
			for (int i=0; i < 2; i++) {
				
				numcarta=carta(0);
				
				if (numcarta == 1) {
					
					numases++;
					
				}
				
				palo=palo(0);
				
				valorcarta=valor_carta(numcarta);
				
				System.out.println(cadena_carta(numcarta, palo));
				
				if (jugador == 1) {
					
					barajaJ1++;
					
					puntosJ1 += valorcarta;
					
					if (i == 1) {
						
						if (puntosJ1 > 21 && numases>0) {
							
							puntosJ1=puntosJ1-(11*numases);
							
							numases--;
							
						}
					
					System.out.println("Puntuación Total: " + puntosJ1);
					
					
					
					}
					
				}
				
				
				
				else if (jugador == 2) {
					
					puntosJ2 += valorcarta;
					
					barajaJ2++;
					
					if (i == 1) {
						
						if (puntosJ2 > 21 && numases>0) {
							
							puntosJ2=puntosJ2-(11*numases);
							
							numases--;
							
						}
					
					System.out.println("Puntuación Total: " + puntosJ2);
					
					}
					
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
				
				if (numcarta == 1) {
					
					numases++;
					
				}
				
				palo=palo(0);
				
				valorcarta=valor_carta(numcarta);
				
				System.out.println(cadena_carta(numcarta, palo));
				
				
				if (jugador == 1) {
					
					puntosJ1 += valorcarta;
					
					barajaJ1++;
					
					if (puntosJ1 > 21 && numases>0) {
						
						puntosJ1=puntosJ1-(11*numases);
						
						numases--;
						
					}
					
					System.out.println("Puntuación Total: " + puntosJ1);
					
					
					
				}
				
				else if (jugador == 2) {
					
					puntosJ2 += valorcarta;
					
					barajaJ2++;
					
					if (puntosJ2 > 21 && numases>0) {
						
						puntosJ2=puntosJ2-(11*numases);
						
						numases--;
					}
					
					System.out.println("Puntuación Total: " + puntosJ2);
					
				}
				
			}
			
				
			}
			
			
		}
		
		if (barajaJ1 == 2 && puntosJ1 == 21 && puntosJ2 != 21) {
			
			System.out.println("Gana el Jugador 1 con un BlackJack");
			
			dineroJ1 = dineroJ1 + (apuesta*2);
			
			dineroJ2 = dineroJ2 - (apuesta*2);
			
			ronda++;
				
			}
		
		else if (barajaJ2 == 2 && puntosJ2 == 21 && puntosJ1 != 21) {
			
			System.out.println("Gana el Jugador 2 con un BlackJack");
			
			dineroJ2 = dineroJ2 + (apuesta*2);
			
			dineroJ1 = dineroJ1 - (apuesta*2);
			
			ronda++;
			
		}
			
		else if ((puntosJ1 > puntosJ2 && puntosJ1 <= 21 && puntosJ2 <= 21) || (puntosJ1 < puntosJ2 && puntosJ1 <= 21 && puntosJ2 > 21)) {
			
			System.out.println("Gana el Jugador 1");
			
			dineroJ1 = dineroJ1 + apuesta;
			
			dineroJ2 = dineroJ2 - apuesta;
			
			ronda++;
			
		}
		
		else if ((puntosJ1 < puntosJ2 && puntosJ1 <= 21 && puntosJ2 <= 21) || (puntosJ1 > puntosJ2 && puntosJ1 > 21 && puntosJ2 <= 21)) {
			
			System.out.println("Gana el Jugador 2");
			
			dineroJ1 = dineroJ1 - apuesta;
			
			dineroJ2 = dineroJ2 + apuesta;
			
			ronda++;
			
	}
			
		
		
		
		
		
		else if ((barajaJ1 == 2 && puntosJ1 == 21 && barajaJ2 == 2 && puntosJ2 == 21) || (puntosJ1 == puntosJ2) || (puntosJ1 > 21 && puntosJ2 > 21)) {
			
			System.out.println("Empate");
			
			ronda++;
			
		}
		
		System.out.printf("Dinero del Jugador 1: %.2f €\n", dineroJ1);
		System.out.printf("Dinero del Jugador 2: %.2f €\n", dineroJ2);
		
		puntosJ1=0;
		
		puntosJ2=0;
		
		} while (dineroJ1 > 0 && dineroJ2 > 0);
		
		if (dineroJ1 == 0 || (dineroJ1 > dineroJ2)) {
			
			System.out.println("Fin del Juego: Jugador 1 ha ganado");
			
		}
		
		else if (dineroJ2 == 0 || (dineroJ1 < dineroJ2)) {
			
			System.out.println("Fin del Juego: Jugador 2 ha ganado");
			
		}
		
		do {
		
		System.out.println("¿Quieres jugar otra ronda?\n1. Sí\n2. No");
		
		salir = keyboard.nextInt();
		
		keyboard.nextLine();
		
		} while (salir < 1 || salir > 2);
		
		if (salir == 2) {
			
			ronda=0;
			
		}
		
		} while (salir != 1);
		
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("Error: no se ha introducido un número");
			
		}
		
	}

}
