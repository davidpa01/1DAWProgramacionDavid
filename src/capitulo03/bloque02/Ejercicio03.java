package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));// se pide un numero
		for (int i = 0; i < 101; i+=num) {// se crea un bucle para calcular los multiplos del numeroS
			System.out.println("Multiplos de " + num + " : " + i);
		}
	}

}
