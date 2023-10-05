package ar.edu.unq.po2.holamundo;

import ar.edu.unq.po2.entes.Nombrable;

public class RecepcionistaFormal extends Recepcionista{

	@Override
	protected String armarSaludo(Nombrable nombrable) {
		return "Buen dia estimado " + nombrable.getNombre();
	}
}
