package capitulo05.bloque02;

import metodos.Utiles;

public class Ejercicio01 {

	public static void main(String[] args) {
		int array[] = new int [150];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utiles.obtenerNumeroAzarEntreLimites(-100, 100);
			if (array[i] % 2 == 0) {
				array[i] = - array[i];
			}
			System.out.println(array[i]);
		}
	}
}
