package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class ejercicio03 {

	public static void main(String[] args) {
		int num;
		int mayor = 0;
		do {
			String str = JOptionPane.showInputDialog("Introduce un número (0 para terminar)");
			num = Integer.parseInt(str);
			if (num > mayor && num != 0) {
				mayor = num;
			}
			
		} while (num != 0);
		System.out.println("El número más grande introducido es: " + mayor);
	}

}
