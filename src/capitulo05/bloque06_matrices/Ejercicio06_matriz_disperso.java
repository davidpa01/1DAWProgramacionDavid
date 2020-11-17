package capitulo05.bloque06_matrices;


/*
 * 6º - Crea un método que compruebe si la matriz es dispersa. (Todos las filas y todas las columnas contienen al menos un elemento nulo).
 */


public class Ejercicio06_matriz_disperso {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int [][] { {1,1,0},
										{0,1,1},
										{1,0,0}};
//		Ejercicio01_rellenar_matriz.rellenarMatriz(matriz);
		boolean dispersa = matrizDispersa(matriz);
		if (dispersa == true) {
			System.out.println("La matriz es dispersa");
		}else {
			System.out.println("La matriz no es dispersa");
			
		}
		System.out.println("");
		Ejercicio02_mostrar_matriz.mostrarMatriz(matriz);
	}
	
	/**
	 * 
	 * @param matriz
	 */
	public static boolean matrizDispersa(int matriz[][]) {
		boolean cero = true;
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length && cero == true; j++) { 
				if (matriz[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}

}
