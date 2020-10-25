package capitulo05.bloque02;

import metodos.Utiles;

public class Ejercicio04 {

	public static void main(String[] args) {
		int array[] = new int [5];
		int aux;
		for (int i = 0; i < array.length; i++) {
			array[i] = Utiles.obtenerNumeroAzar();
			System.out.print(array[i] + ", ");
		}
		System.out.println(" ");
		for (int i = array.length - 1; i >= 0 ; i--) {
			System.out.print(array[i] + ", ");
			if (i > 0) {
				aux = array [i - 1];
				array [i - 1] = array [i];
				array [i] = aux;
			}
		}
	}

}
