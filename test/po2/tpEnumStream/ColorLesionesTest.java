package po2.tpEnumStream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import po2.tpEnumStream.ColorLesiones;

class ColorLesionesTest {
	
	

	@Test
	void testSiguienteColorRojo() {
		
		assertEquals(ColorLesiones.Rojo, ColorLesiones.Miel.getProximoColor());
	}

	@Test 
	void testNivelDeLesion() {
		assertEquals(1,ColorLesiones.Rojo.getNivelDeRiesgo());
	}
}
