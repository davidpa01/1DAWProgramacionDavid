package capitulo05.bloque01;

import metodos.Utiles;

public class Ejercicio02 {

	public static void main(String[] args) {
		int array[] = new int [150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utiles.obtenerNumeroAzar();
		}

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

}
