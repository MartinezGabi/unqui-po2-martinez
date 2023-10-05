package supermercado;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	
	public Supermercado() {
		super();
	}
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public void quitarProducto(Producto producto) {
		this.productos.remove(producto);
		
	}
	
	public Double getPrecioTotal() {
		Double precioTotal = 0.0;
		for(Producto producto : this.productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}
	
	
}
