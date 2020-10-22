package capitulo05.bloque01;

import javax.swing.JOptionPane;

import metodos.Utiles;

public class ejercicio02 {

	public static void main(String[] args) {
		int array[] = new int [150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utiles.obtenerNumeroAzar();
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

}
