package capitulo05.bloque03;

import metodos.Utiles;

/**
 *1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. 
 *Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Burbuja", 
 *con el objetivo de ordenar el array completamente. Puedes consultar el siguiente
 */

public class Ejercicio01_array_150_azar_1_1000_ordenar_burbuja {

	/**
	 * Método principal
	 * @param args
	 */
	
	public static void main(String[] args) {
		int array[] = new int [150];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utiles.obtenerNumeroAzarEntreLimites(0, 1000);
		}
		
	}

}
