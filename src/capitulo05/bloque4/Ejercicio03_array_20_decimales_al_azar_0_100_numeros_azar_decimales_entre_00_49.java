package capitulo05.bloque4;

import metodos.Utiles;

/**
 * Capítulo 5 - Bloque 4 - Ejercicio 3.
 * Crea un array de 20 números decimales creados al azar entre 0 y 100. 
 * Para crear el número decimal debes generar al azar la parte entera
 * y la parte decimal por separado para después unir las dos partes. 
 * A continuación debes examinar la cantidad de números cuya parte 
 * decimal está comprendida entre .00 y .49
 */

public class Ejercicio03_array_20_decimales_al_azar_0_100_numeros_azar_decimales_entre_00_49 {

	/**
	 * Método principal
	 * @param args
	 */
	
	public static void main(String[] args) {
		float array[] = new float [20];//se declara un array de 100 numeros flotantes
		for (int i = 0; i < array.length; i++) {//se le da valores aleatorios al array
			array[i] = Utiles.obtenerNumeroAzar();
			array[i] += (Utiles.obtenerNumeroAzarEntreLimites(0, 49) / (float) 100);//los decimales son numeros aleatorios entre 0 y 49
		}
		for (int i = 0; i < array.length; i++) {//se imprime el array
			System.out.print(array[i] + " ");
		}
	}
}
