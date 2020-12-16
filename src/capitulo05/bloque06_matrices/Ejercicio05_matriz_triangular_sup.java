package capitulo05.bloque06_matrices;


/*
 * Crea un método que compruebe si la matriz es triangular superior. (Todos los elementos que están por debajo de la diagonal principal son nulos).
 */


public class Ejercicio05_matriz_triangular_sup {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int [][] { {1,0,0,0,0},
										{0,1,1,1,1},
										{0,0,2,2,2},
										{0,0,0,3,3},
										{0,0,0,0,4}};
//		Ejercicio01_rellenar_matriz.rellenarMatriz(matriz);
		boolean triangulo = matrizTriangularSup(matriz);
		if (triangulo == true) {
			System.out.println("La matriz es triangular superior");
		}else {
			System.out.println("La matriz no es triangular superior");
			
		}
		System.out.println("");
		Ejercicio02_mostrar_matriz.mostrarMatriz(matriz);
	}
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean matrizTriangularSup(int matriz[][]) {
		for (int i = 1; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
				if (j < i){
					if (matriz[i][j] != 0) {
						 return false;									
					}
				}
			}
		}
		return true;
	}

}
