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
		int matriz[][] = new int [][] { {0,1,2,3,4},
										{1,1,1,1,0},
										{2,0,2,2,2},
										{3,3,0,3,3},
										{4,4,4,0,4}} ;		
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
	 * @return
	 */
	public static boolean matrizDispersa(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			boolean dispersa = false;
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 0) {
					dispersa = true;
					break;
				}
			}
			if (dispersa == false) {
				return false;
			}
		}
		for (int i = 0; i < matriz[0].length; i++) {
			boolean dispersa = false;
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[j][i] == 0) {
					dispersa = true;
				}
			}
			if (dispersa == false) {
				return false;
			}
		}
		return true;
		
	}

}
