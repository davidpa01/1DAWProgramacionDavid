package capitulo04.simulación_de_examen_Opcional;

import java.util.Arrays;

public class Poker {

	Jugador partida[] = new Jugador[5];
	
	
	
	public Poker() {
	}
	
	public Poker(Jugador[] partida) {
		this.partida = partida;
	}


	public String toString() {
		return "Poker [partida=" + Arrays.toString(partida) + "]";
	}
	
	
	

	public Jugador[] getPartida() {
		return partida;
	}

	public void setPartida(Jugador[] partida) {
		this.partida = partida;
	}
	
	









}
