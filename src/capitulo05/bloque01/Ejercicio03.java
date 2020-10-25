package capitulo05.bloque01;

import javax.swing.JOptionPane;

import metodos.Utiles;

public class Ejercicio03 {

	public static void main(String[] args) {
		int array[] = new int [150];
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		boolean esta = false;
		for (int i = 0; i < array.length; i++) {
			array[i] = Utiles.obtenerNumeroAzar();
			if (num == array[i]) {
				esta = true;
				System.out.println("Tu número esta en la lista y esta en la posición " + i);
			}
		}
		if (esta == false) {
			System.out.println("El número introducido no esta.");
		}
	}
}
