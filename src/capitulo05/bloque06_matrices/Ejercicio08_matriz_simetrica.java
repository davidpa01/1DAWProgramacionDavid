package capitulo05.bloque06_matrices;


/*
 * 8º - Crea un método que compruebe si la matriz es simétrica. (Los elementos de la matriz (i, j) y (j, i), 
 * si existen, son iguales). El método recibirá una matriz y devolverá un boolean.
 */


public class Ejercicio08_matriz_simetrica {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int [][] { {0,1,2,3,4},
										{1,1,1,1,1},
										{2,2,2,2,2},
										{3,3,3,3,3},
										{4,4,4,4,4}};
//		Ejercicio01_rellenar_matriz.rellenarMatriz(matriz);
		boolean simetrica = matrizSimetrica(matriz);
		if (simetrica == true) {
			System.out.println("Es simetrica");
		}else {
			System.out.println("No es simetrica");
		}
		System.out.println("");
		Ejercicio02_mostrar_matriz.mostrarMatriz(matriz);
	}
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean matrizSimetrica(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 1; j < matriz[i].length; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					return false;
				}
			}
		}
		return true;
		
	}

}
