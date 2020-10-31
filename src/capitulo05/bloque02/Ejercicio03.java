package capitulo05.bloque02;

import javax.swing.JOptionPane;

import metodos.Utiles;

public class Ejercicio03 {

	public static void main(String[] args) { 
		int array[] = new int [150];//se declara un array
		for (int i = 0; i < array.length; i++) {//se crea un bucle que se repite mientras la i sea menor que la longitud del array
			array[i] = Utiles.obtenerNumeroAzar();
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));//se pide un numero
			System.out.println(array[i] * num);//se multiplican los numeros del array por el numero
		}
	}
}