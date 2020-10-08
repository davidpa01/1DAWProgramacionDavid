package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejercicio02 {

	public static void main(String[] args) {
		System.out.println("1-Realizar una raiz");
		System.out.println("2-Realizar una potencia");
		System.out.println("3-Realizar el modulo de la división");
		String var = JOptionPane.showInputDialog("Elija una opción: ");
		int op = Integer.parseInt(var);
		switch (op) {
		case 1:
			String var1 = JOptionPane.showInputDialog("Introduce indice de la raiz: ");
			int in = Integer.parseInt(var1);
			String var2 = JOptionPane.showInputDialog("Introduce el radical de la raiz: ");
			int radi = Integer.parseInt(var2);
			double raiz = Math.pow(radi, 1/in);
			System.out.println("La raiz de indice " + in + " y de radical " + radi + " tiene como solución: " + raiz);
			break;
		case 2:
			String var3 = JOptionPane.showInputDialog("Introduce indice de la raiz: ");
			int in1 = Integer.parseInt(var3);
			String var4 = JOptionPane.showInputDialog("Introduce el radical de la raiz: ");
			int radi1 = Integer.parseInt(var4);
			double pot = Math.pow(in1 , radi1);
			System.out.println("La raiz de indice " + in1 + " y de radical " + radi1 + " tiene como solución: " + pot);
			break;
		case 3:
			String var5 = JOptionPane.showInputDialog("Introduce indice de la raiz: ");
			//int in = Integer.parseInt(var5);
			String var6 = JOptionPane.showInputDialog("Introduce el radical de la raiz: ");
			//int radi = Integer.parseInt(var6);
			//double raiz = Math.pow(radi, 1/in);
			//System.out.println("La raiz de indice " + in + " y de radical " + radi + " tiene como solución: " + raiz);
			break;
			
			
		}
	}

}
