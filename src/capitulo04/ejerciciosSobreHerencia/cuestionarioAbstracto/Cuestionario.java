package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.ArrayList;
import java.util.List;

import metodos.Utiles;

public class Cuestionario {
	
	static List<Pregunta> cuestionario = new ArrayList<Pregunta>();

	public static void main(String[] args) {
		int acertadas = 0;
		PreguntaVF pregunta1 = new PreguntaVF("La tierra es plana", "F");
		cuestionario.add(pregunta1);
		PreguntaVF pregunta2 = new PreguntaVF("La tierra gira alrededor del sol", "V");
		cuestionario.add(pregunta2);
		PreguntaVF pregunta3 = new PreguntaVF("El sol está frio", "F");
		cuestionario.add(pregunta3);
		PreguntaOpU pregunta4 = new PreguntaOpU("La tierra tiene un satelite llamado: ", "A", "Luna", "Sol", "Marte", "Plutón");
		cuestionario.add(pregunta4);
		PreguntaOpU pregunta5 = new PreguntaOpU("Cuanto es ((2+2)+5*2)*0+100: ", "C", "0", "Todas son correctas", "100", "Ninguna de las anteriores");
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
	}

}
