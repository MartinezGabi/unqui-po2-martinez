package ar.edu.unq.po2.entes;

public class Persona implements Nombrable {
	
	private String nombre;
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
