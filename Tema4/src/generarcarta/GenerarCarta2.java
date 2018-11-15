package generarcarta;

import java.util.Random;

import java.util.Scanner;

public class GenerarCarta2 {

	public static int generarcarta (int x) {
		
		Random random = new Random();
		
		int carta = random.nextInt(52)+1;
		
		return carta;
				
	}

	public static String cadenacarta (int carta) {
		
		String scarta="";
		 
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
		
		 
		 else if (carta == 14) {
			 
			 scarta="As de Corazones";
			 
		 }
		 
		 else if (carta == 15) {
			 
			 scarta="Dos de Corazones";
			 
		 }
		 
		 else if (carta == 16) {
			 
			 scarta="Tres de Corazones";
			 
		 }
		 
		 else if (carta == 17) {
			 
			 scarta="Cuatro de Corazones";
			 
		 }
		 
		 else if (carta == 18) {
			 
			 scarta="Cinco de Corazones";
			 
		 }
		 
		 else if (carta == 19) {
			 
			 scarta="Seis de Corazones";
			 
		 }
		 
		 else if (carta == 20) {
			 
			 scarta="Siete de Corazones";
			 
		 }
		 
		 else if (carta == 21) {
			 
			 scarta="Ocho de Corazones";
			 
		 }
		 
		 else if (carta == 22) {
			 
			 scarta="Nueve de Corazones";
			 
		 }
		 
		 else if (carta == 23) {
			 
			 scarta="Diez de Corazones";
			 
		 }
		 
		 else if (carta == 24) {
			 
			 scarta="Jota de Corazones";
			 
		 }
		 
		 else if (carta == 25) {
			 
			 scarta="Reina de Corazones";
			 
		 }
		 
		 else if (carta == 26) {
			 
			 scarta="Rey de Corazones";
			 
		 }
		 
		 else if (carta == 27) {
			 
			 scarta="As de Diamantes";
			 
		 }
		 
		 else if (carta == 28) {
			 
			 scarta="Dos de Diamantes";
			 
		 }
		 
		 else if (carta == 29) {
			 
			 scarta="Tres de Diamantes";
			 
		 }
		 
		 else if (carta == 30) {
			 
			 scarta="Cuatro de Diamantes";
			 
		 }
		 
		 else if (carta == 31) {
			 
			 scarta="Cinco de Diamantes";
			 
		 }
		 
		 else if (carta == 32) {
			 
			 scarta="Seis de Diamantes";
			 
		 }
		 
		 else if (carta == 33) {
			 
			 scarta="Siete de Diamantes";
			 
		 }
		 
		 else if (carta == 34) {
			 
			 scarta="Ocho de Diamantes";
			 
		 }
		 
		 else if (carta == 35) {
			 
			 scarta="Nueve de Diamantes";
			 
		 }
		 
		 else if (carta == 36) {
			 
			 scarta="Diez de Diamantes";
			 
		 }
		 
		 else if (carta == 37) {
			 
			 scarta="Jota de Diamantes";
			 
		 }
		 
		 else if (carta == 38) {
			 
			 scarta="Reina de Diamantes";
			 
		 }
		 
		 else if (carta == 39) {
			 
			 scarta="Rey de Diamantes";
			 
		 }
		 
		 
		 else if (carta == 40) {
			 
			 scarta="As de Tréboles";
			 
		 }
		 
		 else if (carta == 41) {
			 
			 scarta="Dos de Tréboles";
			 
		 }
		 
		 else if (carta == 42) {
			 
			 scarta="Tres de Tréboles";
			 
		 }
		 
		 else if (carta == 43) {
			 
			 scarta="Cuatro de Tréboles";
			 
		 }
		 
		 else if (carta == 44) {
			 
			 scarta="Cinco de Tréboles";
			 
		 }
		 
		 else if (carta == 45) {
			 
			 scarta="Seis de Tréboles";
			 
		 }
		 
		 else if (carta == 46) {
			 
			 scarta="Siete de Tréboles";
			 
		 }
		 
		 else if (carta == 47) {
			 
			 scarta="Ocho de Tréboles";
			 
		 }
		 
		 else if (carta == 48) {
			 
			 scarta="Nueve de Tréboles";
			 
		 }
		 
		 else if (carta == 49) {
			 
			 scarta="Diez de Tréboles";
			 
		 }
		 
		 else if (carta == 50) {
			 
			 scarta="Jota de Tréboles";
			 
		 }
		 
		 else if (carta == 51) {
			 
			 scarta="Reina de Tréboles";
			 
		 }
		 
		 else if (carta == 52) {
			 
			 scarta="Rey de Tréboles";
			 
		 }
		 
		 else {
			 
			scarta = "Error";
		 }
	 
	 return scarta;
		
	}

	public static int valorcarta (int carta) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int valorcarta=0;
		
		int res=0;
		
		switch (carta) {
		
		case 1: case 14: case 27: case 40:
			
			valorcarta=11;
			
			break;
			
		case 2: case 15: case 28: case 41: valorcarta=2;
		
		break;
		
		case 3: case 16: case 29: case 42: valorcarta=3;
		
		break;
		
		case 4: case 17: case 30: case 43: valorcarta=4;
		
		break;
		
		case 5: case 18: case 31: case 44: valorcarta=5;
		
		break;
		
		case 6: case 19: case 32: case 45: valorcarta=6;
		
		break;
		
		case 7: case 20: case 33: case 46: valorcarta=7;
		
		break;
		
		case 8: case 21: case 34: case 47: valorcarta=8;
		
		break;
		
		case 9: case 22: case 35: case 48: valorcarta=9;
		
		break;
		
		case 10: case 11: case 12: case 13: case 23: case 24: case 25: case 26:
		case 36: case 37: case 38: case 39: case 49: case 50: case 51: case 52:
			
			
			valorcarta=10;
		
		break;
		
		
		}
		
		
		return valorcarta;
		
	}
}
