package pruebas;

import static codigo.Ej3.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ej3_test {

	@Test
	void Primos() {
	
		assertTrue(esPrimo(2));
		assertTrue(esPrimo(3));
		assertTrue(esPrimo(11));
		assertTrue(esPrimo(7));
		
		
		
	}
	
	void noPrimos() {
		
		assertFalse(esPrimo(4));
		assertFalse(esPrimo(1));
		assertFalse(esPrimo(0));
		assertFalse(esPrimo(6));
		
		
		
		
	}

}
