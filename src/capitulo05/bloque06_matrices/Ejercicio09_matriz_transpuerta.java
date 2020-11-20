package capitulo05.bloque06_matrices;

/*
 * 9º - Crea un método que realice la matriz traspuesta de la que recibe. El método recibe una matriz y devuelve otra matriz, la traspuesta. 
 * 
 */


public class Ejercicio09_matriz_transpuerta {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int [][] { {1,2,3,4,5},
										{1,2,3,4,5},
										{1,2,3,4,5},
										{1,2,3,4,5},
										{1,2,3,4,5}};
//		Ejercicio01_rellenar_matriz.rellenarMatriz(matriz);
		int[][] transpuesta = matrizTranspuesta(matriz);
		
		System.out.println("");
		Ejercicio02_mostrar_matriz.mostrarMatriz(matriz);
		System.out.println("");
		System.out.println("");
		Ejercicio02_mostrar_matriz.mostrarMatriz(transpuesta);
	}
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static int[][] matrizTranspuesta(int matriz[][]) {
		int transpuesta[][] = new int [matriz[0].length][matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				transpuesta[i][j] = matriz[j][i];
			}
		}
		
		return transpuesta;
	}

}
