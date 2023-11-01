package po2.holamundo;

import po2.entes.Nombrable;

public class RecepcionistaClasico extends Recepcionista{
	
	@Override
	protected String armarSaludo(Nombrable nombrable) {
		return "hola " + nombrable.getNombre();
	}
}
