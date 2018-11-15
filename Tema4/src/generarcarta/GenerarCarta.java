package generarcarta;

import java.util.Random;

import java.util.Scanner;

public class GenerarCarta {

	public static int carta (int x) {
		
		Random random = new Random();
		
		int carta = random.nextInt(13)+1;
		
		return carta;
				
	}
	
	public static int palo (int x) {
		
		Random random = new Random();
		
		int palo = random.nextInt(4)+1;
		
		return palo;
				
	}
	
	public static String cadena_carta (int carta, int palo) {
		
		String scarta="";
		
	 if (palo == 1) {
		 
		 if (carta == 1) {
			 
			 scarta="As de Picas";
			 
		 }
		 
		 else if (carta == 2) {
			 
			 scarta="Dos de Picas";
			 
		 }
		 
		 else if (carta == 3) {
			 
			 scarta="Tres de Picas";
			 
		 }
		 
		 else if (carta == 4) {
			 
			 scarta="Cuatro de Picas";
			 
		 }
		 
		 else if (carta == 5) {
			 
			 scarta="Cinco de Picas";
			 
		 }
		 
		 else if (carta == 6) {
			 
			 scarta="Seis de Picas";
			 
		 }
		 
		 else if (carta == 7) {
			 
			 scarta="Siete de Picas";
			 
		 }
		 
		 else if (carta == 8) {
			 
			 scarta="Ocho de Picas";
			 
		 }
		 
		 else if (carta == 9) {
			 
			 scarta="Nueve de Picas";
			 
		 }
		 
		 else if (carta == 10) {
			 
			 scarta="Diez de Picas";
			 
		 }
		 
		 else if (carta == 11) {
			 
			 scarta="Jota de Picas";
			 
		 }
		 
		 else if (carta == 12) {
			 
			 scarta="Reina de Picas";
			 
		 }
		 
		 else if (carta == 13) {
			 
			 scarta="Rey de Picas";
			 
		 }
		 
		 else {
			 
			scarta = "Error";
		 }
		 
		
		 
	 }
	 
	 else if (palo == 2) {
		 
		 if (carta == 1) {
			 
			 scarta="As de Corazones";
			 
		 }
		 
		 else if (carta == 2) {
			 
			 scarta="Dos de Corazones";
			 
		 }
		 
		 else if (carta == 3) {
			 
			 scarta="Tres de Corazones";
			 
		 }
		 
		 else if (carta == 4) {
			 
			 scarta="Cuatro de Corazones";
			 
		 }
		 
		 else if (carta == 5) {
			 
			 scarta="Cinco de Corazones";
			 
		 }
		 
		 else if (carta == 6) {
			 
			 scarta="Seis de Corazones";
			 
		 }
		 
		 else if (carta == 7) {
			 
			 scarta="Siete de Corazones";
			 
		 }
		 
		 else if (carta == 8) {
			 
			 scarta="Ocho de Corazones";
			 
		 }
		 
		 else if (carta == 9) {
			 
			 scarta="Nueve de Corazones";
			 
		 }
		 
		 else if (carta == 10) {
			 
			 scarta="Diez de Corazones";
			 
		 }
		 
		 else if (carta == 11) {
			 
			 scarta="Jota de Corazones";
			 
		 }
		 
		 else if (carta == 12) {
			 
			 scarta="Reina de Corazones";
			 
		 }
		 
		 else if (carta == 13) {
			 
			 scarta="Rey de Corazones";
			 
		 }
		 
		 else {
			 
			scarta = "Error";
		 }
		 
		
		 
	 }
	 
	 else if (palo == 3) {
		 
		 if (carta == 1) {
			 
			 scarta="As de Diamantes";
			 
		 }
		 
		 else if (carta == 2) {
			 
			 scarta="Dos de Diamantes";
			 
		 }
		 
		 else if (carta == 3) {
			 
			 scarta="Tres de Diamantes";
			 
		 }
		 
		 else if (carta == 4) {
			 
			 scarta="Cuatro de Diamantes";
			 
		 }
		 
		 else if (carta == 5) {
			 
			 scarta="Cinco de Diamantes";
			 
		 }
		 
		 else if (carta == 6) {
			 
			 scarta="Seis de Diamantes";
			 
		 }
		 
		 else if (carta == 7) {
			 
			 scarta="Siete de Diamantes";
			 
		 }
		 
		 else if (carta == 8) {
			 
			 scarta="Ocho de Diamantes";
			 
		 }
		 
		 else if (carta == 9) {
			 
			 scarta="Nueve de Diamantes";
			 
		 }
		 
		 else if (carta == 10) {
			 
			 scarta="Diez de Diamantes";
			 
		 }
		 
		 else if (carta == 11) {
			 
			 scarta="Jota de Diamantes";
			 
		 }
		 
		 else if (carta == 12) {
			 
			 scarta="Reina de Diamantes";
			 
		 }
		 
		 else if (carta == 13) {
			 
			 scarta="Rey de Diamantes";
			 
		 }
		 
		 else {
			 
			scarta = "Error";
		 }
		 
		
		 
	 }
	 
	 else if (palo == 4) {
		 
		 if (carta == 1) {
			 
			 scarta="As de Tréboles";
			 
		 }
		 
		 else if (carta == 2) {
			 
			 scarta="Dos de Tréboles";
			 
		 }
		 
		 else if (carta == 3) {
			 
			 scarta="Tres de Tréboles";
			 
		 }
		 
		 else if (carta == 4) {
			 
			 scarta="Cuatro de Tréboles";
			 
		 }
		 
		 else if (carta == 5) {
			 
			 scarta="Cinco de Tréboles";
			 
		 }
		 
		 else if (carta == 6) {
			 
			 scarta="Seis de Tréboles";
			 
		 }
		 
		 else if (carta == 7) {
			 
			 scarta="Siete de Tréboles";
			 
		 }
		 
		 else if (carta == 8) {
			 
			 scarta="Ocho de Tréboles";
			 
		 }
		 
		 else if (carta == 9) {
			 
			 scarta="Nueve de Tréboles";
			 
		 }
		 
		 else if (carta == 10) {
			 
			 scarta="Diez de Tréboles";
			 
		 }
		 
		 else if (carta == 11) {
			 
			 scarta="Jota de Tréboles";
			 
		 }
		 
		 else if (carta == 12) {
			 
			 scarta="Reina de Tréboles";
			 
		 }
		 
		 else if (carta == 13) {
			 
			 scarta="Rey de Tréboles";
			 
		 }
		 
		 else {
			 
			scarta = "Error";
		 }
		 
		
		 
	 }
	 
	 else {
		 
		 System.out.println("Error con el palo");
		 
	 }
	 
	 return scarta;
		
	}

	public static int valor_carta (int carta) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int valorcarta=0;
		
		int res=0;
		
		switch (carta) {
		
		case 1:
		
			valorcarta=11;
			
			break;
			
		case 2: valorcarta=2;
		
		break;
		
		case 3: valorcarta=3;
		
		break;
		
		case 4: valorcarta=4;
		
		break;
		
		case 5: valorcarta=5;
		
		break;
		
		case 6: valorcarta=6;
		
		break;
		
		case 7: valorcarta=7;
		
		break;
		
		case 8: valorcarta=8;
		
		break;
		
		case 9: valorcarta=9;
		
		break;
		
		case 10: case 11: case 12: case 13: valorcarta=10;
		
		break;
		
		
		}
		
		
		return valorcarta;
		
	}
}
