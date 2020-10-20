package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {
		String var1 = JOptionPane.showInputDialog("Introduzca un número: ");// Se crea una variable "var1" y se guarda un dato
		int entero = Integer.parseInt(var1);// Se crea una variable "entero" en la que se introduce var1 transformada en número entero
		int par = (entero & 1);// Se crea una variable "par", en la que se guarda la opreacion logica AND de entero y uno 
		if (par == 0) {// Si par es igual a 0 hace lo que hay entre corchetes
			System.out.println("El numero " + entero + " es par.");// Se imprime la variable enetero diciendo que es par
		}
		else {// Si par es distinto de cero
			System.out.println("El número " + entero + " es impar");// Se imprime la variable entero diciendo que es impar
		}

	}

}
