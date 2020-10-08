package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class ejercicio04 {

	public static void main(String[] args) {
		String var1;  //Se crea una variable
		var1 = JOptionPane.showInputDialog("Introduzca un número: "); //Se introduce un numero en la variable
		int num1 = Integer.parseInt(var1); //La variable se combierte en un número
		String var2;  //Se crea una variable
		var2 = JOptionPane.showInputDialog("Introduzca un número: "); //Se introduce un numero en la variable
		int num2 = Integer.parseInt(var2); //La variable se combierte en un número
		String var3;  //Se crea una variable
		var3 = JOptionPane.showInputDialog("Introduzca un número: "); //Se introduce un numero en la variable
		int num3 = Integer.parseInt(var3); //La variable se combierte en un número
		int media = (num1 + num2 + num3)/3; //Se crea una variable, en la que se realiza la media de las anteriores variables
		System.out.println("La media de las tres variables es: " + media); //Se imprime la variable media


	}

}
