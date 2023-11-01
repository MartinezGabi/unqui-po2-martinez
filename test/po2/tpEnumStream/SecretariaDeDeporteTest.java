package po2.tpEnumStream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tpEnumStream.ActividadSemanal;
import po2.tpEnumStream.Deporte;
import po2.tpEnumStream.DiaDeLaSemana;
import po2.tpEnumStream.SecretariaDeDeporte;

class SecretariaDeDeporteTest {
	
	ActividadSemanal actividadLunes;
	ActividadSemanal actividadMartes;
	ActividadSemanal actividadMiercoles;
	ActividadSemanal actividadJueves;
	ActividadSemanal actividadViernes;
	ActividadSemanal actividadSabado;
	SecretariaDeDeporte secretaria;
	
	
	@BeforeEach
	void setUp() {
		actividadLunes = new ActividadSemanal(DiaDeLaSemana.Lunes, 6, 2, Deporte.Futbol);
		actividadMartes = new ActividadSemanal(DiaDeLaSemana.Martes, 8, 1, Deporte.Running);
		actividadMiercoles = new ActividadSemanal(DiaDeLaSemana.Miercoles, 6, 2, Deporte.Basket);
		actividadJueves = new ActividadSemanal(DiaDeLaSemana.Jueves, 7, 2, Deporte.Futbol);
		actividadViernes = new ActividadSemanal(DiaDeLaSemana.Viernes, 5, 3, Deporte.Tennis);
		actividadSabado = new ActividadSemanal(DiaDeLaSemana.Sabado, 5, 4, Deporte.Jabalina);
		secretaria = new SecretariaDeDeporte();
		secretaria.agregarActividad(actividadLunes);
		secretaria.agregarActividad(actividadMartes);
		secretaria.agregarActividad(actividadMiercoles);
		secretaria.agregarActividad(actividadJueves);
		secretaria.agregarActividad(actividadViernes);
		secretaria.agregarActividad(actividadSabado);
		
	}

	@Test
	void testActividadesDeFutbol() {
		List<ActividadSemanal> actividadesEsperadas = new ArrayList<ActividadSemanal>();
		actividadesEsperadas.add(actividadLunes);
		actividadesEsperadas.add(actividadJueves);
		
		assertEquals(actividadesEsperadas, secretaria.actividadesDeFutbol());
	}
	
	@Test
	void testActividadesConComplejidad() {
		List<ActividadSemanal> actividadesEsperadas = new ArrayList<ActividadSemanal>();
		actividadesEsperadas.add(actividadLunes);
		actividadesEsperadas.add(actividadMiercoles);
		actividadesEsperadas.add(actividadJueves);
		
		assertEquals(actividadesEsperadas, secretaria.actividadesConComplejidad(2));
		
	}
	
	@Test
	void testHorasTotalesDeActividades() {
		
		assertEquals(14,secretaria.horasTotalesDeActividades());
	}
	
	@Test
	void testActividadMenosCostosaDeDeporte() {
		
		assertEquals(actividadLunes, secretaria.actividadConMenosCostoParaDeporte(Deporte.Futbol));
	}
	
	@Test
	void testActividadMenosCostosaPorDeporte() {
		Map<Deporte,ActividadSemanal> mapEsperado = new HashMap<>();
		mapEsperado.put(Deporte.Futbol, actividadLunes);
		mapEsperado.put(Deporte.Tennis, actividadViernes);
		mapEsperado.put(Deporte.Basket, actividadMiercoles);
		mapEsperado.put(Deporte.Running, actividadMartes);
		mapEsperado.put(Deporte.Jabalina, actividadSabado);
		
		assertEquals(mapEsperado, secretaria.actividadMasBarataPorDeporte());
		
		System.out.println(actividadJueves.toString());;
	}
	
	@Test
	void testImprimirActividades(){
		secretaria.imprimirTodasLasActividades();
	}
	
}
