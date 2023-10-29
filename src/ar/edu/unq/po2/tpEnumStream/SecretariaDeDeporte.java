package ar.edu.unq.po2.tpEnumStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
	
	public ActividadSemanal actividadConMenosCostoParaDeporte(Deporte deporte) {
		return this.actividades.stream().filter(a->a.getDeporte() == deporte)
		.min(Comparator.comparingInt(ActividadSemanal::costoDeActividad))
		.orElse(null);
	}
	
	public Map<Deporte, ActividadSemanal> actividadMasBarataPorDeporte(){
		return this.actividades.stream().collect(Collectors.groupingBy(a->a.getDeporte(),
	           Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(a->a.costoDeActividad())),
	           optional -> optional.orElse(null))));
	}
	
	public void imprimirTodasLasActividades() {
		this.actividades.stream().forEach(a->System.out.println(a.toString()));
	}
}
