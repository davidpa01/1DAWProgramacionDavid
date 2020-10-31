package capitulo05.bloque01;

import javax.swing.JOptionPane;

import metodos.Utiles;

public class Ejercicio03 {

	public static void main(String[] args) { 
		int array[] = new int [150];//se declara el array
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));//se pide un numero
		boolean esta = false;
		for (int i = 0; i < array.length; i++) {//se crea un bucle que se repite mientras la i sea menor que la longitud del array
			array[i] = Utiles.obtenerNumeroAzar();
			if (num == array[i]) {//si el numero esta en el array en la pocion y la variable boolean se igual a true y se muestra el mensaje de que el num esta
				esta = true;
				System.out.println("Tu número esta en la lista y esta en la posición " + i);
			}
		}
		if (esta == false) {// si la variable boolean es false muestra el mensaje de que no esta en el array
			System.out.println("El número introducido no esta.");
		}
	}
}
