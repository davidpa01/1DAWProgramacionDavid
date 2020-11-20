package capitulo05.bloque06_matrices;
/*
 *    Crea un método que compruebe si la matriz es diagonal (Todos los elementos que no estan en la diagonal principal son nulos).
 */


public class Ejercicio04_matriz_diagonal {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int [][] { {0,1,0,0,0},
										{1,0,1,1,1},
										{2,2,0,2,2},
										{3,3,3,0,3},
										{4,4,4,4,0}};
		Ejercicio01_rellenar_matriz.rellenarMatriz(matriz);
		boolean cero = matrizDiagonal(matriz);
		if (cero == true) {
			System.out.println("La matriz es diagonal");
		}else {
			System.out.println("La matriz no es diagonal");
		}
		System.out.println("");
		Ejercicio02_mostrar_matriz.mostrarMatriz(matriz);
	}
	
	/**
	 * 
	 * @param matriz
	 * @return 
	 */
	public static boolean matrizDiagonal(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
				if (i != j){
					if (matriz[i][j] != 0) {
						 return false;									
					}
				}
			}
		}
		return true;
		
	}

}
