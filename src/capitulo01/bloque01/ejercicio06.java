package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class ejercicio06 {

	public static void main(String[] args) {
		String eur;
		eur = JOptionPane.showInputDialog("Introduce los datos del Euribor: ");
		float var1 = Float.parseFloat(eur);
		String dif;
		dif = JOptionPane.showInputDialog("Introduce los datos del diferencial: ");
		float var2 = Float.parseFloat(dif);
		String cap;
		cap = JOptionPane.showInputDialog("Introduzca su capital: ");
		float var3 = Float.parseFloat(cap);
		String n;
		n = JOptionPane.showInputDialog("Introduzca el número de plazos mensuales para pagar la hipoteca: ");
		int var4 = Integer.parseInt(n);
		float ina;
		ina = var1 + var2 ;
		float im;
		im = ina / 12 / 100;
		float den;
		den =(float) (im * Math.pow((1 + im), var4));
		float num;
		num = (float) (Math.pow((1 + im), var4) - 1);
		float cm;
		cm = var3 * (den / num);
		System.out.println("La cuota mensual es: " + cm);
	}

}
