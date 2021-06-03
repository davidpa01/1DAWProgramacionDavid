package Primer_examen_A;

import javax.swing.JOptionPane;

public class Examen_b {

	public static void main(String[] args) {
		int array[] = new int [100];//se declara un array de 100 elemtos
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un minimo: "));//se pide un valor minimo
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un maximo: "));//se pide un valor maximo
		for (int i = 0; i < array.length; i++) {//se crea un bucle en el que i es 0 y se repite mientras i sea menor que la longitud del array
			array[i] = utiles.obtenerNumeroAzarEntreLimites(min, max);//se le da valores aleatoris entre dos limites
		}
		//se imprime en el orden normal
		System.out.println("Orden normal");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		//se imprime en el orden inverso
		System.out.println("\nOrden inverso");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

}
