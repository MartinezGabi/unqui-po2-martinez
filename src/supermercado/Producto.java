package supermercado;

public class Producto {
	
	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado = false;
	
	public Producto() {
		super();
	}
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, Double precio, Boolean esPrecioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setPreciosCuidados(Boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public Boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
		
	}
	
	public void aumentarPrecio(Double cantidadAAumentar) {
		this.precio += cantidadAAumentar;
	}
	

}
