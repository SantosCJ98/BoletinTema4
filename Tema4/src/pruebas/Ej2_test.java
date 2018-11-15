package pruebas;

import static codigo.Ej2.*;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ej2_test {

	@Test
	void divisionporcero() {
		Assertions.assertThrows(ArithmeticException.class, () -> calcuenteros(5,0,'/'));
	
		
	}

}
