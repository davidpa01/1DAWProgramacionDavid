package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class ejercicio01 {
 
	public static void main(String[] args) {
		String entero;
		entero = JOptionPane.showInputDialog("Introduzca un numero entero: ");
		String flotante;
		flotante = JOptionPane.showInputDialog("Introduzca un numero flotante: ");
		String doble;
		doble = JOptionPane.showInputDialog("Introduzca un numero doble: ");
		System.out.println(entero + ", " + flotante + " y " + doble);
	}

}
