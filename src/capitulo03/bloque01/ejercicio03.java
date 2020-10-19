package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class ejercicio03 {

	public static void main(String[] args) {
		int num = 1;
		for (; num != 0;) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número(0 para terminar): "));
			if (num > 0) {
				System.out.println("El número " + num + " es positivo");
			} 
			else {
				if (num < 0 && num != 0) {
					System.out.println("El número " + num + " es negativo");
				}
			}
		}
	}
}
