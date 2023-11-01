package po2.claseStreams;

import java.util.ArrayList;

public class Restaurante {
	
	private ArrayList<Plato> productos = new ArrayList<Plato>();
	
	
	public ArrayList<Plato> getProductos(){
		return this.productos;
	}
	
	public void agregarPlato(Plato plato) {
		this.productos.add(plato);
	}

	public Double precioTotalProductosConIVAMenorA(Double precioConIVA) {
		return this.productos.stream().filter(p->p.getPrecioConIVA()< precioConIVA)
		.mapToDouble(p->p.getPrecioConIVA())
		.sum();
	}
}
 
