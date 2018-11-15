package pruebas;

import static codigo.Ej5.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ej5ab_test {

	@Test
	void Perfecto() {
	
		assertTrue(esPerfecto(6));
		assertTrue(esPerfecto(496));
		
		
		
	}
	
	void noPerfecto() {
		
		assertFalse(esPerfecto(4));
		assertFalse(esPerfecto(1));
		assertFalse(esPerfecto(0));
		
		
		
		
	}

}
