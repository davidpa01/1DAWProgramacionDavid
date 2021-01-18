package capitulo04.ejerciciosSobreHerencia.ventanaConCanvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MiCanvas extends Canvas {
	 

	public void paint(Graphics g) {		
		g.setColor(Color.green);
		g.fillOval(50, 50, 50, 50);
		g.setColor(Color.red);
		g.fillRect(200, 200, 100, 150);
		
		int[] xPoints = {75,50,100};
		int[] yPoints = {150,200,200};
		g.setColor(Color.blue);
		g.fillPolygon(xPoints, yPoints, 3);
	
	}

}
