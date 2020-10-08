package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class ejercicio08 {

	public static void main(String[] args) {
		String var1 = JOptionPane.showInputDialog("Introduzca un número: ");
		int entero = Integer.parseInt(var1);
		int par = (entero & 1);
		if (par == 0) {
			System.out.println("El numero " + entero + " es par.");
		}
		else {
			System.out.println("El número " + entero + " es impar");
		}

	}

}
