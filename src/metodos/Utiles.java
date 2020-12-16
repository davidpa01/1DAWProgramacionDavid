package metodos;

import javax.swing.JOptionPane;

public class Utiles {
	
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 100);
	}
	public static int  obtenerNumAzarConNumero(int num) {
		 return (int) Math.round(Math.random() * num);
		
	}

	public static int obtenerNumeroAzarEntreLimites (int minimo, int maximo) {
		 return (int) Math.round(Math.random() * (maximo - minimo) + minimo);
	}
	public static int obtenerNum() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		return num;
	}
	
	public static String pedirTexto() {
		String str = JOptionPane.showInputDialog("Introduce un texto");
		return str;
	}
	
	public static void rellenarArray (int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utiles.obtenerNumeroAzar();
		}
		
	}
	
	public static void imprimirArray (int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	public static void rellenarMatriz(int [][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = obtenerNumeroAzar();
			}
		}
	}
	
	public static void mostrarMatriz(int [][] matrriz) {
		for (int i = 0; i < matrriz.length; i++) {
			for (int j = 0; j < matrriz.length; j++) {
				System.out.print(matrriz[i][j] + "\t");
			}
			System.out.println("");
		}
		
	}
}