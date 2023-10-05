package ar.edu.unq.po2.holamundo;

import ar.edu.unq.po2.entes.Nombrable;

public abstract class Recepcionista {
	
	public void saludar(Nombrable nombrable) {
		System.out.println(this.armarSaludo(nombrable));
	}
	protected abstract String armarSaludo(Nombrable nombrable);

}
