package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {
		int num;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (0 para terminar)"));
			if (num > 0) {
				System.out.println("El número " + num + " es positivo");
			}
			else {
				if (num < 0 && num != 0) {
					System.out.println("El número " + num + " es negativo");					
				}
			}
		} while (num != 0);
	}
}
