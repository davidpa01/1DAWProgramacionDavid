package capitulo05.bloque04;

import metodos.Utiles;

/**
 * Capítulo 5 - Bloque 4 - Ejercicio 3.
 * Crea un array de 20 números decimales creados al azar entre 0 y 100. 
 * Para crear el número decimal debes generar al azar la parte entera
 * y la parte decimal por separado para después unir las dos partes.
 * A continuación debes examinar la cantidad de números cuya parte 
 * decimal está comprendida entre .00 y .49
 */

public class Ejercicio02_array_al_azar_0_10_media_aprobados_suspensos {

	/**
	 * Método principal
	 * @param args
	 */
	
	public static void main(String[] args) {
		int array[] = new int [20];//se declara un array de 20 elementos
		int contadorap = 0, contadorsus = 0;//se declara dos variables para contar
		for (int i = 0; i < array.length; i++) {//se le da valores aleatorios comprendidos entre 0 y 10 al array
			array[i] = Utiles.obtenerNumeroAzarEntreLimites(0, 10);
		}
		for (int i = 0; i < array.length; i++) { //se imprime el array
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 5) {//se comprueva que las notas sean mayores o iguales a 5 para sumar uno a los aprobados
				contadorap ++;
			}else {// si no se summa uno a los suspensos
				contadorsus ++;
			}
		}
		//se realiza el procentaje de aprobados y suspensos y se imprimen
		System.out.println(((contadorap * 100)/array.length) + "% de alumnos han aprovado");
		System.out.println(((contadorsus * 100)/array.length) + "% de alumnos han suspendido");
	}
	

}
