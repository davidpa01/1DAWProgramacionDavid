package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class ejercicio01 {

	public static void main(String[] args) {
		int suma = 0;
		int num;
		do {
			String str = JOptionPane.showInputDialog("Introduzca un número (0 para terminar)");
			num = Integer.parseInt(str);
			suma = suma + num;
			
		} while(num != 0);
		System.out.println("La suma de los números es: " + suma);
	}

}
