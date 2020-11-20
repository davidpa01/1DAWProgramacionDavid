package capitulo05.bloque06_matrices;

import javax.swing.JOptionPane;

/*
 * 11º - Crea un método que pida al usuario un número de fila sobre una matriz. 
 * Debes crear una matriz igual a la original pero eliminando el número de fila 
 * que el usuario ha especificado. El método recibirá una matriz y un valor entero, 
 * que representa una fila de la matriz, y devuelve una nueva matriz.
 * 
 */


public class Ejercicio11_eliminar_filas_matriz {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int [][] { {0,0,0,0,0},
										{1,1,1,1,1},
										{2,2,2,2,2},
										{3,3,3,3,3},
										{4,4,4,4,4}};
//		Ejercicio01_rellenar_matriz.rellenarMatriz(matriz);
		Ejercicio02_mostrar_matriz.mostrarMatriz(matriz);
		int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de fila que quiere eliminar (la primera es 0):"));
		int[][] transpuesta = eliminarFilas(matriz,fila);
		
		System.out.println("");
		System.out.println("");
		Ejercicio02_mostrar_matriz.mostrarMatriz(transpuesta);
	}
	
	/**
	 * 
	 * @param matriz
	 * @param filas
	 * @return
	 */
	public static int[][] eliminarFilas(int matriz[][], int fila) {
		int k = 0;
		int eliminada[][] = new int [matriz.length - 1][matriz[0].length];
		for (int i = 0; i < eliminada.length; i++) {
			if (i == fila) {
				k++;
			}
			for (int j = 0; j < eliminada[i].length; j++) {
				eliminada[i][j] = matriz[k][j];	
			}
			
			k++;
		}
		return eliminada;
	}

}
