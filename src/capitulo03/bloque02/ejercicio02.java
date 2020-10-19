package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class ejercicio02 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce el número de núemros que quieres porner: ");
		int num = Integer.parseInt(str);
		int mayor = 0;
		for (int i = 0; i < num; i++) {
			String str2 = JOptionPane.showInputDialog("Introduzca un número: ");
			int num2 = Integer.parseInt(str2);
			if (num2 > mayor) {
				mayor = num2;
			}
		}
		System.out.println("El número mayor es: " + mayor);
	}

}
