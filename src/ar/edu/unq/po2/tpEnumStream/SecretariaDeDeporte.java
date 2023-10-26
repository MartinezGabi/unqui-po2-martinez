package tpenum;

import java.util.ArrayList;
import java.util.List;

public class SecretariaDeDeporte {
	
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	public List<ActividadSemanal> getActividades(){
		return actividades;
	}
	
	public void agregarActividad(ActividadSemanal actividad) {
		this.actividades.add(actividad);
	}
	
	public void quitarActividad(ActividadSemanal actividad) {
		this.actividades.remove(actividad);
	}

	public List<ActividadSemanal> actividadesDeFutbol(){
		return this.actividades.stream().filter(d->d.getDeporte().equals(Deporte.Futbol))
		.toList();
	}
	
	public List<ActividadSemanal> actividadesConComplejidad(int complejidad){
		return this.actividades.stream().filter(d->d.getDeporte().getComplejidad() == complejidad)
		.toList();		
	}
	
	public int horasTotalesDeActividades() {
		return this.actividades.stream().mapToInt(a->a.getDuracion()).sum();
	}
}
