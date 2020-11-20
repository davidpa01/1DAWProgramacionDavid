package capitulo05.bloque06_matrices;

/*
 * 10º - Crea un método que realice la matriz opuesta de la que recibe. El método recibe una matriz y devuelve otra, la opuesta. 
 * 
 */


public class Ejercicio10_matriz_opuesta {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int [][] { {1,2,3,4,5},
										{-6,7,8,9,0},
										{-2,-3,-4,4,10},
										{1,4,5,4,0},
										{1,4,5,9,1}};
//		Ejercicio01_rellenar_matriz.rellenarMatriz(matriz);
		int[][] transpuesta = matrizOpuesta(matriz);
		
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
	public static int[][] matrizOpuesta(int matriz[][]) {
		int opuesta[][] = new int [matriz[0].length][matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				opuesta[i][j] = -matriz[i][j];
			}
		}
		
		return opuesta;
	}

}
