package po2.tpEnumStream;

public enum Deporte {
	
	Running(1), Futbol(2), Basket(2),
	Tennis(3), Jabalina(4);
	
	private int nivelDeComplejidad;
	
	Deporte(int nivelDeComplejidad){
		this.nivelDeComplejidad = nivelDeComplejidad;
	}
	
	public int getComplejidad() {
		return this.nivelDeComplejidad;
	}

}
