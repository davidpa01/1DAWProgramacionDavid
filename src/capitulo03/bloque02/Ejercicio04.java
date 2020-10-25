package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));//Se pide un numero
		int lim = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
		for (int i = 0; i <= lim; i+=num) {// se crea un bucle en el que i = o y se repite mientra que i sea menor que el limite y avavza sumando por el numero
			System.out.println("Multiplos de " + num + " : " + i);// se muestra los multiplos del numero
		}

	}

}
