package capitulo05.bloque06_matrices;
/*
 *   - Crea un método que imprima la matriz en pantalla.
 */


public class Ejercicio02_mostrar_matriz {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int [5][5];
		Ejercicio01_rellenar_matriz.rellenarMatriz(matriz);
		mostrarMatriz(matriz);

	}
	
	/**
	 * 
	 * @param matriz
	 */
	public static void mostrarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
