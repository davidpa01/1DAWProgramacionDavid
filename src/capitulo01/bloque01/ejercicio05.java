package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class ejercicio05 {

	public static void main(String[] args) {
		String var1; //Se crea una variable
		var1 = JOptionPane.showInputDialog("Introduzca un número: "); //Se introduce un numero en la variable
		String var2; //Se crea una variable
		var2 = JOptionPane.showInputDialog("Introduzca un número: "); //Se introduce un numero en la variable
		System.out.println("La primera variable es: " + var1 + ", La segunda variable es: " + var2); // Se imprime las variables antes de cambiarlas
		String var3; //Se crea una variable
		var3 = var1; //Se guarda en la var3 la var1
		var1 = var2; //Se guarda en la var1 la var2
		var2 = var3; //Se guarda en la var2 la var3
		System.out.println("La primera variable es: " + var1 + ", La segunda variable es: " + var2); // Se imprime las variables despues del cambio 
	}

}
