package capitulo05.bloque02;

import javax.swing.JOptionPane;

import metodos.Utiles;

public class Ejercicio03 {

	public static void main(String[] args) {
		int array[] = new int [150];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utiles.obtenerNumeroAzar();
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
			System.out.println(array[i] * num);
		}
	}
}