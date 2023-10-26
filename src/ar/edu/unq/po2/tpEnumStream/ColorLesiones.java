package ar.edu.unq.po2.tpEnumStream;

public enum ColorLesiones {
	
	
	Rojo("color rojo", 1){
		@Override
		public ColorLesiones getProximoColor() {
			return Gris;
		}
	},Gris("color gris", 2){
		@Override
		public ColorLesiones getProximoColor() {
			return Amarillo;
		}
	},Amarillo("color amarillo", 3){
		@Override
		public ColorLesiones getProximoColor() {
			return Miel;
		}
	},Miel("color miel", 4){
		@Override
		public ColorLesiones getProximoColor() {
			return Rojo;
		}
	};
	
	private String descripcion;
	private float nivelDeRiesgo;
	
	ColorLesiones(String descripcion, float nivel){
		this.descripcion = descripcion;
		this.nivelDeRiesgo = nivel;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public void setNivelDeRiesgo(float nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}

	public abstract ColorLesiones getProximoColor();
		
}
