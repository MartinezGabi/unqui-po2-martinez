package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	
	Persona persona1;
	Persona persona2;
	Persona persona3;
	Persona persona4;
	Persona persona5;
	
	EquipoDeTrabajo equipo1;
	
	@BeforeEach
	void setUp() {
		equipo1 = new EquipoDeTrabajo("team");
		persona1 = new Persona("juan","xd",20);
		persona2 = new Persona("pepe","xd2",30);
		persona3 = new Persona("jose", "xd3", 50);
		persona4 = new Persona("tiago", "xd4", 30);
		persona5 = new Persona("carlos","xd5", 20);
		
		
	}

	@Test
	void testCantidadDeIntegrantes() {
		equipo1.agregarIntegrante(persona1);
		
		assertEquals(1, equipo1.getIntegrantes().size());
	}
	
	@Test
	void testEdadPromedio() {
		equipo1.agregarIntegrante(persona1);
		equipo1.agregarIntegrante(persona2);
		equipo1.agregarIntegrante(persona3);
		equipo1.agregarIntegrante(persona4);
		equipo1.agregarIntegrante(persona5);
		
		assertEquals(30,equipo1.promedioDeEdad());
		
	}

}
