package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class ejercicio02 {

	public static void main(String[] args) {
		int num = 1;
		int suma = 0;
		for (int i = 0; num != 0; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número(0 para terminar): "));
			if (i == 0) {
				if (num > 10) {
					suma = suma + num;
				}
			}
			else {
				if (num > 10) {
					suma = suma + num;
				}
			}	
		}
		System.out.println("La suma de números mayores de 10 vale: " + suma);
	}
}
