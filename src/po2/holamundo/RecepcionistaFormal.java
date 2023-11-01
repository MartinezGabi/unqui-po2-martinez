package po2.holamundo;

import po2.entes.Nombrable;

public class RecepcionistaFormal extends Recepcionista{

	@Override
	protected String armarSaludo(Nombrable nombrable) {
		return "Buen dia estimado " + nombrable.getNombre();
	}
}
