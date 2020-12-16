package capitulo04.simulación_de_examen_Opcional;

import metodos.Utiles;

public class Baraja {

	Carta cartas[] = new Carta [52];
	int k = 51;
	
	/**
	 * 
	 */
	public Baraja() {
		int id = 0;
		for (int i = 1; i <= 13; i++) {
			cartas[id] = new Carta(i, "Picas", id);
			id++;
		}
		for (int i = 1; i <= 13; i++) {
			cartas[id] = new Carta(i, "Diamantes", id);
			id++;
		}
		for (int i = 1; i <= 13; i++) {
			cartas[id] = new Carta(i, "Treboles", id);
			id++;
		}
		for (int i = 1; i <= 13; i++) {
			cartas[id] = new Carta(i, "Corazones", id);
			id++;
		}
	}
	
	/**
	 * 
	 */
	public void primeraAultima() {
		Carta aux;
		aux = cartas[0];
		
		for (int j = 0; j < cartas.length - 1; j++) {
			cartas[j] = cartas[j + 1];
		}
		
		cartas[cartas.length - 1] = aux;
	}
	
	/**
	 * 
	 */
	public void ultimaAprimera() {
		Carta aux;
		aux = cartas[cartas.length - 1];
		for (int j = cartas.length - 1; j > 0; j--) {
			cartas[j] = cartas[j-1];
		}
		cartas[0] = aux;
	}
	
	
	/**
	 * 
	 */
	public void mezcla() {
		for (int i = 0; i < 100; i++) {
			int indice1 = Utiles.obtenerNumeroAzarEntreLimites(0, cartas.length - 1);
			int indice2 = Utiles.obtenerNumeroAzarEntreLimites(0, cartas.length - 1);
			Carta aux = cartas[indice1];
			cartas[indice1] = cartas[indice2];
			cartas[indice2] = aux;
		}
	}
	
	/**
	 * 
	 */
	public void ordenar() {
		boolean hayIntercambios;
		System.out.println("Ordenando...");
		do {
			hayIntercambios = false;
			for (int i = 0; i < cartas.length - 1; i++) {
				if (cartas[i+1].getId() < cartas[i].getId()) {
					Carta aux = cartas[i+1];
					cartas[i+1] = cartas[i];
					cartas[i] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios);
	}
	
	/**
	 * 
	 */
	public void mostrar() {
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
	}
	
	public void repartir(Jugador jugador) {
		for (int i = 0; i < jugador.getMano().length; i++) {
			jugador.getMano()[i] = cartas[k];
			k--;
		}
		
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Baraja baraja = new Baraja();
//		Jugador jugador1 = new Jugador();
//		Jugador jugador2 = new Jugador();
//		
//		baraja.repartir(jugador1);
//		baraja.repartir(jugador2);
//		System.out.println(jugador1.toString());
//		System.out.println(jugador2.toString());
//		baraja.primeraAultima();
//		baraja.ultimaAprimera();
		baraja.mezcla();
//		baraja.mostrar();
//		baraja.ordenar();
		baraja.mostrar();
		System.out.println("\n");
		
		Poker jugada = new Poker();
		
		for (int i = 0; i < jugada.getPartida().length; i++) {
			
			Jugador jugador  = new Jugador();
			
			jugador.setNombre("Jugador" + i);
			
			baraja.repartir(jugador);
		
			jugada.getPartida()[i] = jugador;
			
			jugador.jugada(jugador);
			
		}
		
		System.out.println(jugada.toString());
	}

}
