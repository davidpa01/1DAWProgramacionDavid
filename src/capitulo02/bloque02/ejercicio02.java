package capitulo02.bloque02;

import javax.swing.JOptionPane;

public class ejercicio02 {

	public static void main(String[] args) {
		String var1 = JOptionPane.showInputDialog("Introduce un número: ");
		int num1 = Integer.parseInt(var1);
		String var2 = JOptionPane.showInputDialog("Introduce un número: ");
		int num2 = Integer.parseInt(var2);
		String var3 = JOptionPane.showInputDialog("Introduce un número: ");
		int num3 = Integer.parseInt(var3);
		String var4 = JOptionPane.showInputDialog("Introduce un número: ");
		int num4 = Integer.parseInt(var4);
		String var5 = JOptionPane.showInputDialog("Introduce un número: ");
		int num5 = Integer.parseInt(var5);
		int conteonumbajos = 0, conteonummedios = 0, conteonumgrandes = 0;
		int sumabaj = 0, sumamed = 0, sumagrand = 0;
		if(num1 <= 0 || num2 <= 0 || num3 <= 0 || num4 <= 0 || num5 <= 0) {
			return;
		}
		if(0 <= num1 && num1 <= 25) {
			conteonumbajos = conteonumbajos +1;
			sumabaj = sumabaj + num1;
		}
		else if(25 <= num1 && num1 <= 250) {
			conteonummedios = conteonummedios +1;
			sumamed = sumamed + num1;
		}
		else if(250 < num1) {
			conteonumgrandes = conteonumgrandes +1;
			sumagrand = sumagrand + num1;
		}
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
		System.out.println("Los números comprendidos entre 0 y 25 son: " + conteonumbajos + " Y la suma es:" + sumabaj);
		System.out.println("Los números comprendidos entre 25 y 250 son: " + conteonummedios + " Y la suma es:" + sumamed);
		System.out.println("Los números mayores de 250 son: " + conteonumgrandes + " Y la suma es:" + sumagrand);

	}

}
