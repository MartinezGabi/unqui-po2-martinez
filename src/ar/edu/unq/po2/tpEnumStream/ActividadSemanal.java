package ar.edu.unq.po2.tpEnumStream;

public class ActividadSemanal {
	
	private DiaDeLaSemana diaDeLaSemana;
	private int horaDeInicio;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, int horaInicio,
							int duracion, Deporte deporte) {
		this.diaDeLaSemana = dia;
		this.horaDeInicio = horaInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	public DiaDeLaSemana getDiaDeLaSemana() {
		return diaDeLaSemana;
	}

	public void setDiaDeLaSemana(DiaDeLaSemana diaDeLaSemana) {
		this.diaDeLaSemana = diaDeLaSemana;
	}

	public int getHoraDeInicio() {
		return horaDeInicio;
	}

	public void setHoraDeInicio(int horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}
	
	public int costoDeActividad() {
		if(this.diaDeLaSemana.ordinal() < 3) {
			return (this.duracion * 500 + this.deporte.getComplejidad() * 200);
		}
		else {
			return (this.duracion * 1000 + this.deporte.getComplejidad() * 200);
		}
	}
	
	public String toString() {
		return "Deporte: " + deporte + ". Dia: " + diaDeLaSemana + " a las: " + horaDeInicio + ". Duracion: " + duracion;
	}
	
}
