package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		int num = 1;
		int suma = 0;
		for (;num != 0;) {//Se crea un bucle en el que i = 0 y se ritira mientra i sea distinto de 0
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número(0 para terminar): "));// Se pide un numeroS
			if (num > 10) {// si el numero es mayor de diez se realiza la suma
				suma = suma + num;
			}
		}
		System.out.println("La suma de números mayores de 10 vale: " + suma);// Se muestra la suma
	}
}
