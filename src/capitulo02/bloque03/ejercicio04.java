package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejercicio04 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca la cantidad de dinero con la que se paga: ");
		int dinero = Integer.parseInt(str);
		String str1 = JOptionPane.showInputDialog("Introduzca la cantidad de dinero que cuesta: ");
		int precio = Integer.parseInt(str1);
		int vuelta = dinero - precio;
		System.out.println(vuelta);
		int conteo100 = 0;
		int conteo50 = 0;
		int conteo25 = 0;
		int conteo5 = 0;
		int conteo1 = 0;
	}

}
