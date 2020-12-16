package capitulo04.simulación_de_examen_Opcional;

import java.util.Arrays;

public class Jugador {
	
	
	private String nombre;
	private Carta mano[] = new Carta[5];
	
	
	public void jugada(Jugador jugador) {
		int cont = 1;
		for (int i = 0; i < mano.length; i++) {
			cont = 1;
			for (int j = i + 1; j < mano.length; j++) {
				if (mano[i].getValor() == mano[j].getValor()) {
					cont++;
				}
			}
			switch (cont) {
			case 2:
				System.out.println(jugador.getNombre() + " Pareja");
				break;
			case 3:
				System.out.println(jugador.getNombre() + " Trio");
				break;
			case 4:
				System.out.println(jugador.getNombre() + " Poker");
				break;
			}
		}
		
	}



	public Jugador() {
	}

	

	public Jugador(String nombre, Carta[] mano) {
		super();
		this.nombre = nombre;
		this.mano = mano;
	}


	
	
	public String toString() {
		return "Jugador [nombre=" + nombre + "\n mano=" + Arrays.toString(mano) + "]\n";
	}



	



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Carta[] getMano() {
		return mano;
	}



	public void setMano(Carta[] mano) {
		this.mano = mano;
	}




}
