package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un número");
		int num = Integer.parseInt(str);
		for (int i = 0; i < 101; i+=num) {
			System.out.println("Multiplos de " + num + " : " + i);
		}
	}

}
