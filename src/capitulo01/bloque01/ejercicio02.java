package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class ejercicio02 {

	public static void main(String[] args) {
		String entero; // Se crea una variable de tipo cadena
		entero = JOptionPane.showInputDialog("Introduzca un numero entero: "); // Se guarda un número entero en la variable entero
		System.out.println("El número entero es: " + entero); // Se imprime la variable entero 
		String flotante; // Se crea una variable de tipo cadena
		flotante = JOptionPane.showInputDialog("Introduzca un numero flotante: "); // Se guarda un número entero en la variable entero
		System.out.println("El número flotante es: " + flotante); // Se imprime la variable flotante 
		String doble; // Se crea una variable de tipo cadena
		doble = JOptionPane.showInputDialog("Introduzca un numero doble: "); // Se guarda un número entero en la variable entero
		System.out.println("El número doble es: " + doble); // Se imprime la variable doble 
	}

}
