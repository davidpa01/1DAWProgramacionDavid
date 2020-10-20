package capitulo02.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		String var1 = JOptionPane.showInputDialog("Introduce un número: ");// Se crea una variable y se guarda un dato
		int num1 = Integer.parseInt(var1);// Se crea una variable  en la que se introduce  transformada en número entero
		String var2 = JOptionPane.showInputDialog("Introduce un número: ");// Se crea una variable y se guarda un dato
		int num2 = Integer.parseInt(var2);// Se crea una variable  en la que se introduce  transformada en número entero
		String var3 = JOptionPane.showInputDialog("Introduce un número: ");// Se crea una variable y se guarda un dato
		int num3 = Integer.parseInt(var3);// Se crea una variable  en la que se introduce  transformada en número entero
		String var4 = JOptionPane.showInputDialog("Introduce un número: ");// Se crea una variable y se guarda un dato
		int num4 = Integer.parseInt(var4);// Se crea una variable  en la que se introduce  transformada en número entero
		String var5 = JOptionPane.showInputDialog("Introduce un número: ");// Se crea una variable y se guarda un dato
		int num5 = Integer.parseInt(var5);// Se crea una variable  en la que se introduce  transformada en número entero
		int conteonumbajos = 0, conteonummedios = 0, conteonumgrandes = 0;// Se crea una variable  en la que se introduce  transformada en número entero
		int sumabaj = 0, sumamed = 0, sumagrand = 0;// Se crea una variable "" en la que se introduce  transformada en número entero
		if(num1 <= 0 || num2 <= 0 || num3 <= 0 || num4 <= 0 || num5 <= 0) {
			return;
		}
		if(0 <= num1 && num1 <= 25) {// se comprueba sin num esta entre 0 y 25
			conteonumbajos = conteonumbajos +1;//Se suma 1 a la variable
			sumabaj = sumabaj + num1;// Se suma num1 a una variable
		}
		else if(25 <= num1 && num1 <= 250) {// se comprueba sin num esta entre 25 y 250
			conteonummedios = conteonummedios +1;//Se suma 1 a la variable
			sumamed = sumamed + num1;// Se suma num1 a una variable
		}
		else if(250 < num1) {// se comprueba sin num > 250
			conteonumgrandes = conteonumgrandes +1;//Se suma 1 a la variable
			sumagrand = sumagrand + num1;// Se suma num1 a una variable
		}
		//A partir de aqui se hace lo mismo pero con num2, num3, num4 y num5
		if(0 <= num2 && num2 <= 25) {
			conteonumbajos = conteonumbajos +1;
			sumabaj = sumabaj + num2;
		}
		else if(25 <= num2 && num2 <= 250) {
			conteonummedios = conteonummedios +1;
			sumamed = sumamed + num2;
		}
		else if(250 < num2) {
			conteonumgrandes = conteonumgrandes +1;
			sumagrand = sumagrand + num2;
		}
		if(0 <= num3 && num3 <= 25) {
			conteonumbajos = conteonumbajos +1;
			sumabaj = sumabaj + num3;
		}
		else if(25 <= num3 && num3 <= 250) {
			conteonummedios = conteonummedios +1;
			sumamed = sumamed + num3;
		}
		else if(250 < num3) {
			conteonumgrandes = conteonumgrandes +1;
			sumagrand = sumagrand + num3;
		}
		if(0 <= num4 && num4 <= 25) {
			conteonumbajos = conteonumbajos +1;
			sumabaj = sumabaj + num4;
		}
		else if(25 <= num4 && num4 <= 250) {
			conteonummedios = conteonummedios +1;
			sumamed = sumamed + num4;
		}
		else if(250 < num4) {
			conteonumgrandes = conteonumgrandes +1;
			sumagrand = sumagrand + num4;
		}
		if(0 <= num5 && num5 <= 25) {
			conteonumbajos = conteonumbajos +1;
			sumabaj = sumabaj + num5;
		}
		else if(25 <= num5 && num5 <= 250) {
			conteonummedios = conteonummedios +1;
			sumamed = sumamed + num5;
		}
		else if(250 < num5) {
			conteonumgrandes = conteonumgrandes +1;
			sumagrand = sumagrand + num5;
		}
		System.out.println("Los números comprendidos entre 0 y 25 son: " + conteonumbajos + " Y la suma es:" + sumabaj);// Se muestra la suma de numeros bajos
		System.out.println("Los números comprendidos entre 25 y 250 son: " + conteonummedios + " Y la suma es:" + sumamed);// Se muestra la suma de numeros medios
		System.out.println("Los números mayores de 250 son: " + conteonumgrandes + " Y la suma es:" + sumagrand);// Se muestra la suma de numeros grandes

	}

}
