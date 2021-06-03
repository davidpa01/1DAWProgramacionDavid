package Primer_examen_A;

import javax.swing.JOptionPane;

public class Examen_e {
	public static void main(String[] args) {
		int array[] = new int [20];//se declara un array de 20 elemtos
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero de solo una cifra: "));
		for (int i = 0; i < array.length; i++) {//se crea un bucle en el que i es 0 y se repite mientras i sea menor que la longitud del array
			array[i] = utiles.obtenerNumeroAzar100();//se le da valores aleatorios entre 0 y 100
		}
		for (int i = 0; i < array.length; i++) {//se crea un bucle en el que i es 0 y se repite mientras i sea menor que la longitud del array
			System.out.print(array[i] + " ");
		}
	}
}
