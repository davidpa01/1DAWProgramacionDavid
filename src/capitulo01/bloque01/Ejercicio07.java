package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {
		String var0 = JOptionPane.showInputDialog("Introduzca una variable");//Se crea la variable (var0) y en ella se guarda un dato
		int var1 = Integer.parseInt(var0);// Se crea una variable (var1), en la que se guarda la var0 transformada en entero
		int num = ~var1 + 1;// Se crea una variable (num) donde se guarda el complemento a dos de la variable var1
		System.out.println("El complemento a dos de " + var0 + " es: " + num);// Se imprime la variable num
	}

}
