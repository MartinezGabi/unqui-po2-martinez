package ar.edu.unq.po2.holamundo;

import ar.edu.unq.po2.entes.Nombrable;

public class RecepcionistaClasico extends Recepcionista{
	
	@Override
	protected String armarSaludo(Nombrable nombrable) {
		return "hola " + nombrable.getNombre();
	}
}
