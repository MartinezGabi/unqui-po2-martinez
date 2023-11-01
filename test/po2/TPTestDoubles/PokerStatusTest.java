package po2.TPTestDoubles;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.TPTestDoubles.Carta;
import po2.TPTestDoubles.PokerStatus;

class PokerStatusTest {
	
	PokerStatus poker = new PokerStatus();
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
	
	@BeforeEach
	void setUp() {
		carta1 = new Carta(1,"pica");
		carta2 = new Carta(1,"diamante");
		carta3 = new Carta(1,"corazones");
		carta4 = new Carta(1,"trebol");
		carta5 = new Carta(3,"pica");
		
		
	}

	@Test
	void testVerificarPoker() {
		assertTrue(poker.verificar(carta1, carta2, carta3 , carta4, carta5));
	}
	
	@Test
	void testVerificarColor() {
		
	}
	@Test
	void testVerificarTrio() {
		
	}
	@Test
	void testCartaPalo() {
		
		assertEquals("pica", carta1.getPalo());
	}
	
	@Test
	void testCartaValor() {
		
		assertEquals(1, carta1.getValor());
	}
	
	@Test void testCartaMayorQue() {
		
		assertTrue(carta5.cartaMayorQue(carta2));
	}
	
	
}
