package ar.edu.unq.po2.tpEnumStream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
