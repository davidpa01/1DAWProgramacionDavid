package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un número");
		int num = Integer.parseInt(str);
		String str2 = JOptionPane.showInputDialog("Introduzca un número");
		int lim = Integer.parseInt(str2);
		for (int i = 0; i <= lim; i+=num) {
			System.out.println("Multiplos de " + num + " : " + i);
		}

	}

}
