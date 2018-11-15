package pruebas;

import static codigo.Ej1.calculadora;


import java.util.InputMismatchException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ej1_test {

	@Test
	void divisionporcero() {
		Assertions.assertThrows(ArithmeticException.class, () -> calculadora(5,0,'/'));
	}

}
