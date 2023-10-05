package supermercado;

public class ProductoPrimeraNecesidad extends Producto {

	private Double descuentoPorcentual;
	
	public ProductoPrimeraNecesidad() {
		super();
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Double descuento) {
		super(nombre, precio);
		this.descuentoPorcentual = descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado, Double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuentoPorcentual = descuento;
	}
	
	public Double getPrecio() {
		Double descuento = super.getPrecio() * (this.descuentoPorcentual / 100);
		return super.getPrecio() - descuento;
	}

}
