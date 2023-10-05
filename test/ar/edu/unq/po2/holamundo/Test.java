package ar.edu.unq.po2.holamundo;

import ar.edu.unq.po2.entes.Nombrable;
import ar.edu.unq.po2.entes.Persona;

public class Test {
	
	public static void main(String[] args) {
		Recepcionista recepcionista = makeRecepcionista();
		Nombrable nombrable = new Mundo();
		recepcionista.saludar(nombrable);
		nombrable = new Persona("jose");
		recepcionista.saludar(nombrable);
	}
	
	private static Recepcionista makeRecepcionista() {
		return new RecepcionistaFormal();
	}
}
