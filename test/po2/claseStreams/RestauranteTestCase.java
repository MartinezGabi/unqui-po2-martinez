package po2.claseStreams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import po2.claseStreams.Plato;
import po2.claseStreams.Restaurante;

class RestauranteTestCase {
	
	Restaurante restaurante;
	Plato platoMila;
	Plato platoGuiso;
	Plato platoAsado;
	Plato platoTortilla;

	@Test
	void testPrecioConIva() {
		restaurante = new Restaurante();
		platoMila = new Plato("milanesa con fritas", 1500d);
		platoGuiso = new Plato("guiso de lentejas", 1800d);
		platoAsado = new Plato("asado con ensalada", 2000d);
		platoTortilla = new Plato("tortilla de papas", 1400d);
		restaurante.agregarPlato(platoMila);
		restaurante.agregarPlato(platoAsado);
		restaurante.agregarPlato(platoGuiso);
		restaurante.agregarPlato(platoTortilla);
		
		assertEquals(3509d, restaurante.precioTotalProductosConIVAMenorA(2000d));
		
	}
	
	@Test void testCantidadDePlatos() {
		restaurante = new Restaurante();
		platoMila = new Plato("milanesa con fritas", 1500d);
		platoGuiso = new Plato("guiso de lentejas", 1800d);
		platoAsado = new Plato("asado con ensalada", 2000d);
		platoTortilla = new Plato("tortilla de papas", 1400d);
		restaurante.agregarPlato(platoMila);
		restaurante.agregarPlato(platoAsado);
		restaurante.agregarPlato(platoGuiso);
		restaurante.agregarPlato(platoTortilla);
		
		assertEquals(4, restaurante.getProductos().size());
	}

}
