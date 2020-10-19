package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejercicio04 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca la cantidad de dinero con la que se paga: ");
		int dinero = Integer.parseInt(str);
		String str1 = JOptionPane.showInputDialog("Introduzca la cantidad de dinero que cuesta: ");
		int precio = Integer.parseInt(str1);
		int vuelta = dinero - precio;
		int conteo100 = 0;
		int conteo50 = 0;
		int conteo25 = 0;
		int conteo5 = 0;
		int conteo1 = 0;
		
		if (vuelta >= 100) {
			conteo100 = vuelta / 100;
			vuelta = vuelta - (conteo100 * 100);
			System.out.println(conteo100 + " monedas de 100");
		}
		if (vuelta >= 50) {
			conteo50 = vuelta / 50;
			vuelta = vuelta - (conteo50 * 50);
			System.out.println(conteo50 + " monedas de 50");
		}
		if (vuelta >= 25) {
			conteo25 = vuelta / 25;
			vuelta = vuelta - (conteo25 * 25);
			System.out.println(conteo25 + " monedas de 25");
		}
		if (vuelta >= 5) {
			conteo5 = vuelta / 5;
			vuelta = vuelta - (conteo5 * 5);
			System.out.println(conteo5 + " monedas de 5");
		}
		if (vuelta >= 1) {
			conteo1 = vuelta / 1;
			vuelta = vuelta - (conteo1 * 1);
			System.out.println(conteo1 + " monedas de 1");	
		}
	}
}
