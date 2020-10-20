package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num;
		int suma = 0;
		for (int i = 0; i < 4; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
			if (num > 10) {
				suma = suma + num;
			}
		}
		System.out.println("La suma de números mayores de 10 es: " + suma);
	}

}
