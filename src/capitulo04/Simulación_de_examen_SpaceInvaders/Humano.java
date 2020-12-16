package capitulo04.Simulación_de_examen_SpaceInvaders;

import metodos.Utiles;

public class Humano {
	
	private int puntosVida = Utiles.obtenerNumeroAzarEntreLimites(50, 100);
	private String nombre;
	private boolean vivo = true;
	int cdM = 0;
	
	
	
	
	
	
	
	
	
	
	
	public Humano() {
	}



	public Humano(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	


	@Override
	public String toString() {
		return "\nHumano [puntosVida=" + puntosVida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
	}



	//getters y setters
	
	public int getPuntosVida() {
		return puntosVida;
	}



	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public boolean isVivo() {
		return vivo;
	}



	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}



	public int getCdM() {
		return cdM;
	}



	public void setCdM(int cdM) {
		this.cdM = cdM;
	}


	
	
	
	
	
	
	
	
	
	
	
	
}
