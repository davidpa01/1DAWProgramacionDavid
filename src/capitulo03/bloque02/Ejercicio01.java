package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de núemros que quieres porner: "));//se pide un numero
		int suma = 0;
		for (int i = 0; i < num; i++) { // se crea un bucle en el que i es 0 y se repite mientras i sea menor que el numero
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));//se pide un numero
			suma = suma +num2;//se realiza la suma
		}
		double media = suma / num;// Se realiza la media
		System.out.println("La media de los numeros introducidos es " + media);//se muestra la media
	}

}
