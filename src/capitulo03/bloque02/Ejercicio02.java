package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce el número de núemros que quieres porner: ");
		int num = Integer.parseInt(str);
		int mayor = 0;
		int menor = 0;
		for (int i = 0; i < num; i++) {
			String str2 = JOptionPane.showInputDialog("Introduzca un número: ");
			int num2 = Integer.parseInt(str2);
			if (i == 0) {
				menor = num2;
			}
			if (num2 > mayor) {
				mayor = num2;
			}
			if (num2 < menor) {
				menor = num2;
			}
		}
		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
	}

}
