package capitulo05.bloque06_matrices;


/*
 * 7º - Crea un método que construya un array unidimensional con todos los elementos de la matriz. El método recibirá una matriz y devolverá un array.
 */


public class Ejercicio07_matriz_a_array {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int [][] { {1,2,3,4,5},
										{6,7,8,9,10},
										{11,12,13,14,15},
										{16,17,18,19,20},
										{21,22,23,24,25}};
//		Ejercicio01_rellenar_matriz.rellenarMatriz(matriz);
		int[] array = matrizArray(matriz);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println("");
		Ejercicio02_mostrar_matriz.mostrarMatriz(matriz);
	}
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static int[] matrizArray(int matriz[][]) {
		int longitud = 0;
		int k = 0;
		for (int i = 0; i < matriz.length; i++) {
			longitud += matriz[i].length;
		}
		int array[] = new int [longitud];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[k] = matriz[i][j];
				k++;
			}
		}
		return array;
	}

}
