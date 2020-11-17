package capitulo05.bloque06_matrices;
/*
 *   Crea un método que compruebe si la matriz es positiva. (Todos sus elementos mayores o iguales a cero)
 */


public class Ejercicio03_matriz_positiva {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int [5][5];
		Ejercicio01_rellenar_matriz.rellenarMatriz(matriz);
		boolean positivo = matrizPositiva(matriz);
		if (positivo == true) {
			System.out.println("La matriz es positiva");
		}else {
			System.out.println("La matriz no es positiva");
		}
		System.out.println("");
		Ejercicio02_mostrar_matriz.mostrarMatriz(matriz);
		
	}
	
	/**
	 * 
	 * @param matriz
	 */
	public static boolean matrizPositiva(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
					if (matriz[i][j] < 0) {
						return false;
					}		
			}
		}
		return true;
	}

}
