package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce el número de núemros que quieres porner: ");
		int num = Integer.parseInt(str);
		int suma = 0;
		for (int i = 0; i < num; i++) {
			String str2 = JOptionPane.showInputDialog("Introduzca un número: ");
			int num2 = Integer.parseInt(str2);
			suma = suma +num2;
		}
		double media = suma / num;
		System.out.println("La media de los numeros introducidos es " + media);
	}

}
