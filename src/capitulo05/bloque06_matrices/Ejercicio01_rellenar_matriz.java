package capitulo05.bloque06_matrices;
/*
 *  Realiza un programa que cree un array bidimensional, una matriz, de 5 filas x 5 columnas. Una vez hecho el array, realiza estos pasos:
 *  Crea un método que rellena la matriz con valores creados al azar.
 */

import metodos.Utiles;

public class Ejercicio01_rellenar_matriz {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int [5][5];
		rellenarMatriz(matriz);

	}
	
	/**
	 * 
	 * @param matriz
	 */
	public static void rellenarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
				matriz[i][j] = Utiles.obtenerNumeroAzarEntreLimites(-100, 100);
			}
		}
	}

}
