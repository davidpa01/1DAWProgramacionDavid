package capitulo04.ejerciciosSobreHerencia.cuadraditos;


import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;


public class Ventana {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("cuadrados");
		ventana.setBounds(0, 0, 800, 600);
		
		List<Actor> actores = creaActores();
		
		// Para colocar objetos sobre la ventana debo asignarle un "layout" (plantilla) al panel principal de la ventana
		ventana.getContentPane().setLayout(new BorderLayout());
		    
		// Creo y agrego un canvas, es un objeto que permitirá dibujar sobre él
		MiCanvas canvas = new MiCanvas(actores);
		canvas.setBackground(Color.WHITE);
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);
		// Hago que la ventana sea visible
		ventana.setVisible(true);
	}
	
	
	private static List<Actor> creaActores () {
		List<Actor> actores = new ArrayList<Actor>();
		
		// Creo los Monstruos del juego
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int xInicial = i;
				int yInicial = j;
				Ladrillo l = new Ladrillo(xInicial, yInicial);
				actores.add(l);				
			}
		}
		
		// Devuelvo la lista con todos los actores del juego
		return actores;
	}

}
