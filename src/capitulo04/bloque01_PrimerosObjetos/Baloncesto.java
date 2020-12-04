package capitulo04.bloque01_PrimerosObjetos;

import java.util.ArrayList;
import java.util.List;

public class Baloncesto {

	public static void main(String[] args) {
		CromoBaloncesto j1 = new CromoBaloncesto("Jose", 210, 89, (float) 10.5);
		CromoBaloncesto j2 = new CromoBaloncesto("Antonio", 180, 120, (float) 30.3);
		CromoBaloncesto j3 = new CromoBaloncesto("Lebron", 190, 70, (float) 3.3);
		CromoBaloncesto j4 = new CromoBaloncesto("Miguel", 215, 95, (float) 30.4);
		CromoBaloncesto j5 = new CromoBaloncesto("Francisco", 160, 50, (float) 25.3);
		List<CromoBaloncesto> cromos = new ArrayList<CromoBaloncesto>();
		cromos.add(j1); cromos.add(j2); cromos.add(j3); cromos.add(j4); cromos.add(j5);
		System.out.println("\n\nContenido de la coleccion");
		for (int i = 0; i < cromos.size(); i++) {
			System.out.println(cromos.get(i).toString() + "\n");
		}
		ordenaJugadores(cromos);
		System.out.println("\n Después de la ordenación\n");
		for (int i = 0; i < cromos.size(); i++) {
			System.out.println(cromos.get(i).toString() + "\n");
		}
	}

	/**
	 * Implementa el algoritmo de la buburja para ordenar un array
	 * @param array Array desordenado que se ordenará
	 */
	public static void ordenaJugadores (List<CromoBaloncesto> cromos) {
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			// Empieza el algoritmo
			for (int i = 0; i < cromos.size() - 1; i++) {
				if (cromos.get(i+1).getPuntosMediosPorpartido() < cromos.get(i).getPuntosMediosPorpartido()) {
					// Entonces hago un intercambio
					CromoBaloncesto aux = cromos.get(i+1);
					cromos.set(i + 1, cromos.get(i));
					cromos.set(i, aux);
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios == true);
	}

}
