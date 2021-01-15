package capitulo04.ejerciciosSobreHerencia.ventanaConCanvas;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;



public class Ventana {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Space Invaders");
		ventana.setBounds(0, 0, 800, 600);
		
		// Para colocar objetos sobre la ventana debo asignarle un "layout" (plantilla) al panel principal de la ventana
		ventana.getContentPane().setLayout(new BorderLayout());
		
		// Creo y agrego un canvas, es un objeto que permitirá dibujar sobre él
		MiCanvas canvas = new MiCanvas();
		canvas.setBackground(Color.WHITE);
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);
		// Hago que la ventana sea visible
		ventana.setVisible(true);
	}

}
