package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.ArrayList;
import java.util.List;

import metodos.Utiles;

public class Cuestionario {
	
	static List<Pregunta> cuestionario = new ArrayList<Pregunta>();

	public static void main(String[] args) {
		int acertadas = 0;
		PreguntaVF pregunta1 = new PreguntaVF("La tierra es plana",1, "F");
		cuestionario.add(pregunta1);
		PreguntaVF pregunta2 = new PreguntaVF("La tierra gira alrededor del sol", 2,"V");
		cuestionario.add(pregunta2);
		PreguntaVF pregunta3 = new PreguntaVF("El sol está frio", 3,"F");
		cuestionario.add(pregunta3);
		PreguntaOpU pregunta4 = new PreguntaOpU("La tierra tiene un satelite llamado: ", 4, 0, new String[] {"Luna","Sol","Marte","Plutón"});
		cuestionario.add(pregunta4);
		PreguntaOpU pregunta5 = new PreguntaOpU("Cuanto es ((2+2)+5*2)*0+100: ", 5, 2, new String[] {"0","Todas son correctas","100","Ninguna de las anteriores"});
		cuestionario.add(pregunta5);
		
		for (Pregunta p : cuestionario) {
			p.mostrar();
			String respuestaOb = Utiles.pedirTexto();
			System.out.println();
			boolean correcta = p.esCorrecta(respuestaOb);
			if (correcta) {
				acertadas++;
			}
		}
		System.out.println("Has acertado " + acertadas + " preguntas.");
		float media = acertadas * 100 / (float) cuestionario.size();
		System.out.println("Tu media es " + media);
	}

}
