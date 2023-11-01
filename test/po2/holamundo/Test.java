package po2.holamundo;

import po2.entes.Nombrable;
import po2.entes.Persona;
import po2.holamundo.Mundo;
import po2.holamundo.Recepcionista;
import po2.holamundo.RecepcionistaFormal;

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
