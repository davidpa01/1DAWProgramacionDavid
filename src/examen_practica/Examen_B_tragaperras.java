package examen_practica;

import javax.swing.JOptionPane;

import metodos.Utiles;

public class Examen_B_tragaperras {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int [3];
		int op;
		int acumulador = 0;
		do {
			menu();
			valoresArray(array);				
			System.out.println("");
			mostrarArray(array);
			System.out.println("");
			acumulador += puntos(array);
			System.out.println("Los puntos son " + acumulador);
			op = Integer.parseInt(JOptionPane.showInputDialog("Si quieres parar de jugar pulsa 0"));
			System.out.println("");
		}while(op != 0);
	}
	
	
	
	/**
	 * 
	 */
	public static void menu() {
		System.out.println("LAS TRAGAPERRAS");
		System.out.println("---------------");
		System.out.println("0.- Salir");
		System.out.println("1.- Mora");
		System.out.println("2.- Naranja");
		System.out.println("3.- Campana");
		System.out.println("4.- Dolar");
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void valoresArray(int [] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Utiles.obtenerNumeroAzarEntreLimites(1, 4);
		}
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	/**
	 * 
	 * @param acumulador
	 * @param array
	 */
	public static int puntos(int array[]) {
		int acumulador = 0;
		if (array[0] == array[1] && array[0] == array[2]) {
			acumulador += 1000;
			if (array[0] == 4) {
				acumulador += 3000;
			}
		}if (array[0] != array[1] && array[0] != array[2] && array[1] != array[2]) {
			acumulador -= 100;
		}
		
		
		return acumulador;
	}

}
