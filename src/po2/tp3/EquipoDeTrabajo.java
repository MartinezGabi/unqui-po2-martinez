package po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombre;
	private ArrayList<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo() {
		super();
	}
	public EquipoDeTrabajo(String nombre) {
		this();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}
	
	public void setIntegrantes(ArrayList<Persona> integrantes) {
		this.integrantes = integrantes;
	}
	
	public void agregarIntegrante(Persona persona) {
		integrantes.add(persona);
	}
	
	public void removerIntegrante(Persona persona) {
		integrantes.remove(persona);
	}
	
	public float promedioDeEdad() {
		int sumaEdades = 0;
		for(Persona persona: integrantes) {
			sumaEdades += persona.getEdad();
		}
		return(float) sumaEdades / integrantes.size();
	}
}
