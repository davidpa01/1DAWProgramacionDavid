package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		int num;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número (0 para terminar)"));
			for (int i = 0; i < 11; i++) {
				if (num != 0) {
					System.out.println(i + " x " + num + " = " + (i * num));
				}
			}
		} while (num != 0);
	}

}
