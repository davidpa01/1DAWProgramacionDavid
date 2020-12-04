package capitulo04.bloque01_PrimerosObjetos;

public class CromoBaloncesto {
	private String nombreJugador;
	private int alturaCm;
	private int pesoKg;
	private float puntosMediosPorpartido;
	
	/**
	 * 
	 */
	public CromoBaloncesto () {
		
	}
	
	/**
	 * 
	 * @param nombreJugador
	 * @param alturaCm
	 * @param pesoKg
	 * @param puntosMediosPorpartido
	 */
	public CromoBaloncesto (String nombreJugador, int alturaCm, int pesoKg, float puntosMediosPorpartido) {
		this.nombreJugador = nombreJugador;
		this.alturaCm = alturaCm;
		this.pesoKg = pesoKg;
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}
	
	public String toString() {
		return "Nombre: " + nombreJugador + "\nAltura: " + alturaCm + "\nPeso: " + pesoKg + "\nMedia de Puntos por partido: " + puntosMediosPorpartido;
	}
	
	
	
	// Getters y Setters 
	
		/**
		 * 
		 * @return
		 */
		public String getNombreJugador() {
			return nombreJugador;
		}
		
		

		/**
		 * 
		 * @param nombreJugador
		 */
		public void setNombreJugador(String nombreJugador) {
			this.nombreJugador = nombreJugador;
		}

		/**
		 * 
		 * @return
		 */
		public int getAlturaCm() {
			return alturaCm;
		}
		
		

		/**
		 * 
		 * @param alturaCm
		 */
		public void setAlturaCm(int alturaCm) {
			this.alturaCm = alturaCm;
		}
		
		
		
		
		/**
		 * 
		 * @return
		 */
		public int getPesoKg() {
			return pesoKg;
		}
		
		

		/**
		 * 
		 * @param pesoKg
		 */
		public void setPesoKg(int pesoKg) {
			this.pesoKg = pesoKg;
		}
		
		
		
		
		/**
		 * 
		 * @return
		 */
		public float getPuntosMediosPorpartido() {
			return puntosMediosPorpartido;
		}
		
		
		

		/**
		 * 
		 * @param puntosMediosPorpartido
		 */
		public void setPuntosMediosPorpartido (float puntosMediosPorpartido) {
			this.puntosMediosPorpartido = puntosMediosPorpartido;
		}
}
