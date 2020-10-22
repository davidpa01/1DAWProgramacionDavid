package capitulo05.bloque01;

import javax.swing.JOptionPane;

import metodos.Utiles;

public class Ejercicio01 {

	public static void main(String[] args) {
		int array[] = new int [150];
		int liminf = Integer.parseInt(JOptionPane.showInputDialog("Introduce un limite inferior"));
		int limsup = Integer.parseInt(JOptionPane.showInputDialog("Introduce un limite superior"));
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utiles.obtenerNumeroAzarEntreLimites(liminf, limsup);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
	}

}
