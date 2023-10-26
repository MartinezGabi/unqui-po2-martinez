package ar.edu.unq.po2.tpEnumStream;

public class ActividadSemanal {
	
	private DiaDeLaSemana diaDeLaSemana;
	private String horaDeInicio;
	private String duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, String horaInicio,
							String duracion, Deporte deporte) {
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

	public String getHoraDeInicio() {
		return horaDeInicio;
	}

	public void setHoraDeInicio(String horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	
	
}
