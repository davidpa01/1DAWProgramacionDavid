package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		int num;
		int menor = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (0 para terminar): "));
		int mayor = menor;
		do {
			String str = JOptionPane.showInputDialog("Introduce un número (0 para terminar)");
			num = Integer.parseInt(str);
			if (num < menor && num != 0) {
				menor = num;
			}
			if (num > mayor && num != 0) {
				mayor = num;
			}
			
		} while (num != 0);
		System.out.println("El número más pequeño introducido es: " + menor);
		System.out.println("El número más grande introducido es: " + mayor);
	}

}
