package capitulo05.bloque4;

import metodos.Utiles;

/**
 * Capítulo 5 - Bloque 4 - Ejercicio 1.
 * Crea un método que reciba un array de números enteros creados al azar entre 0 y 100.
 *  El método debe examinar la longitud del array, comprobar que la longitud es un valor
 *   impar y devolver el valor que se encuentre en la posición media.
 *    En caso de que la longitud del array sea un número par no se debe devolver un valor -1.
 */

public class Ejercicio01_array_al_azar_0_100_posicion_media {

	/**
	 * Método principal
	 * @param args
	 */
	
	public static void main(String[] args) {
		int array[] = new int [Utiles.obtenerNumeroAzar()];//se declara un array de longitud al azar
		for (int i = 0; i < array.length; i++) {//se le da valores infinitos entre 0 y 100 al array
			array[i] = Utiles.obtenerNumeroAzar();
		}
		for (int i = 0; i < array.length; i++) {//se imprime el array
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		if (array.length % 2 == 0) {//si el resto de imprimir la longitud entre 2 es 0 de vuelve un -1
			System.out.println("-1");
		}else {//si no de vuelve el valor en la posicion media del array 
			int posicion = array.length / 2;
			System.out.println(array[posicion]);
		}
		
	}

}
