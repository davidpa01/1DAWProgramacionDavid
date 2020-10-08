package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class ejercicio05 {

	public static void main(String[] args) {
		String var1 = JOptionPane.showInputDialog("Introduzca un número: ");// Se crea una variable "var1" y se guarda un dato
		int num1 = Integer.parseInt(var1);// Se crea una variable "num1" en la que se introduce var1 transformada en número entero
		String var2 = JOptionPane.showInputDialog("Introduzca un número: ");// Se crea una variable "var2" y se guarda un dato
		int num2 = Integer.parseInt(var2);// Se crea una variable "num2" en la que se introduce var1 transformada en número entero
		String var3 = JOptionPane.showInputDialog("Introduzca un número: ");// Se crea una variable "var3" y se guarda un dato
		int num3 = Integer.parseInt(var3);// Se crea una variable "num3" en la que se introduce var1 transformada en número entero
		String var4 = JOptionPane.showInputDialog("Introduzca un número: ");// Se crea una variable "var4" y se guarda un dato
		int num4 = Integer.parseInt(var4);// Se crea una variable "num4" en la que se introduce var1 transformada en número entero
		String var5 = JOptionPane.showInputDialog("Introduzca un número: ");// Se crea una variable "var5" y se guarda un dato
		int num5 = Integer.parseInt(var5);// Se crea una variable "num5" en la que se introduce var1 transformada en número entero
		if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {// Si el num1 es mayor que las demas variables, realiza lo que esta entre corchetes
			System.out.println("El número mayor es: " + num1);// Se imprime el num1 ya que es mayor
		}
		else {
			if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5) {// Si el num2 es mayor que las demas variables, realiza lo que esta entre corchetes
				System.out.println("El número mayor es: " + num2);// Se imprime el num2 ya que es mayor
			}
			else {
				if(num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5) {// Si el nu3 es mayor que las demas variables, realiza lo que esta entre corchetes
					System.out.println("El número mayor es: " + num3);// Se imprime el num3 ya que es mayor
				}
				else {
					if(num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5) {// Si el num4 es mayor que las demas variables, realiza lo que esta entre corchetes
						System.out.println("El número mayor es: " + num4);// Se imprime el num4 ya que es mayor
					}
					else {
						System.out.println("El número mayor es: " + num5);// Se imprime el num5 ya que es mayor
					}
				}
			}
		}
		if (num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5) {// Si el num1 es mayor que las demas variables, realiza lo que esta entre corchetes
			System.out.println("El número menor es: " + num1);// Se imprime el num1 ya que es mayor
		}
		else {
			if (num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5) {// Si el num2 es mayor que las demas variables, realiza lo que esta entre corchetes
				System.out.println("El número menor es: " + num2);// Se imprime el num2 ya que es mayor
			}
			else {
				if(num3 <= num1 && num3 <= num2 && num3 <= num4 && num3 <= num5) {// Si el num3 es mayor que las demas variables, realiza lo que esta entre corchetes
					System.out.println("El número menor es: " + num3);// Se imprime el num3 ya que es mayor
				}
				else {
					if(num4 <= num1 && num4 <= num2 && num4 <= num3 && num4 <= num5) {// Si el num4 es mayor que las demas variables, realiza lo que esta entre corchetes
						System.out.println("El número menor es: " + num4);// Se imprime el num4 ya que es mayor
					}
					else {
						System.out.println("El número menor es: " + num5);// Se imprime el num5 ya que es mayor
					}
				}
			}
		}

	}

}
