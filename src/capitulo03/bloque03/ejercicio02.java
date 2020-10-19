package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class ejercicio02 {

	public static void main(String[] args) {
		double suma = 0;
		double num;
		double conteo = 0;
		double media;
		do {
			String str = JOptionPane.showInputDialog("Introduzca un número (0 para terminar)");
			num = Double.parseDouble(str);
			if(num != 0) {
				conteo ++;
			}
			suma = suma + num;
			media = suma / conteo;
		} while(num != 0);
		System.out.println("La suma de los números es: " + media);
	}

}
