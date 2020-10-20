package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		String var1 = JOptionPane.showInputDialog("Introduzca un número: ");// Se crea una variable "var1" y se guarda un dato
		int num1 = Integer.parseInt(var1);// Se crea una variable "num1" en la que se introduce var1 transformada en número entero
		String var2 = JOptionPane.showInputDialog("Introduzca un número: ");// Se crea una variable "var" y se guarda un dato
		int num2 = Integer.parseInt(var2);// Se crea una variable "num2" en la que se introduce var2 transformada en número entero
		if (num1 >= num2) {// Si el num1 es mayor que num2, realiza lo que esta entre corchetes
			System.out.println("El número menor es: " + num2);// Se imprime el num2 ya que es menor que num1
		}
		else {
			if (num1 <= num2) {// Si el num1 es menor que num2, realiza lo que esta entre corchetes
				System.out.println("El número menor es: " + num1);// Se imprime el num1 ya que es menor que num2
			}
		}

	}

}
