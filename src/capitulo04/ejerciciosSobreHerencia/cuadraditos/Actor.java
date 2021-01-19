package capitulo04.ejerciciosSobreHerencia.cuadraditos;

import java.awt.Graphics;

public abstract class Actor {

	protected int x, y ,ancho, alto;

	
	
	


	public Actor() {
		super();
	}


	public Actor(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	

	public abstract void paint(Graphics g); 
	
	public abstract void actua();
	
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}

	
}
