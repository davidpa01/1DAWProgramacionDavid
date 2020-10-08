package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class ejercicio06 {

	public static void main(String[] args) {
		String var1 = JOptionPane.showInputDialog("Introduzca un número: ");// Se crea una variable "var1" y se guarda un dato
		int num = Integer.parseInt(var1);// Se crea una variable "num" en la que se introduce var1 transformada en número entero
		int resto = (num % 2);// Se crea una variable "resto", en la que se guarda el resto de la division de num entre 2
		if (resto == 0) { // Si el resto es igual a 0 hace lo que hay entre corchetes
			System.out.println("El numero " + num + " es par.");// Se imprime la variable num diciendo que es par
		}
		else {// Si el resto es distinto de cero
			System.out.println("El número " + num + " es impar");// Se imprime la variable num diciendo que es impar
		}

	}

}
