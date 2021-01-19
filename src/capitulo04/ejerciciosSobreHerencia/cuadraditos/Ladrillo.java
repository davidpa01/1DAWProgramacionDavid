package capitulo04.ejerciciosSobreHerencia.cuadraditos;

import java.awt.Color;
import java.awt.Graphics;

public class Ladrillo extends Actor {

	
	

	
	public Ladrillo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ladrillo(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(this.x, this.y, this.ancho, this.alto);		
	}

	@Override
	public void actua() {
		this.x += this.x;
		// Si el monstruo abandona la escena por la izquierda o la derecha, rebota
		if (this.x < 0 || this.x > 800) {
			this.x = -this.x;
		}
		
		// Copiamos el esquema anterior para el movimiento vertical
		this.y += this.y;
		// Si el monstruo abandona la escena por la izquierda o la derecha, rebota
		if (this.y < 0 || this.y > 600) {
			this.y = -this.y;
		}		
	}

}
