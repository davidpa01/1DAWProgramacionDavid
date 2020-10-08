package repaso;

import javax.swing.JOptionPane;

public class sueldo {
	public static void main(String[] args) {
		String horas = JOptionPane.showInputDialog("Numero de horas extras que desea dar: ");
		float var1 = Float.parseFloat(horas);
		String dinero = JOptionPane.showInputDialog("Precio al que se pagan las horas extras: ");
		float var2 = Float.parseFloat(dinero);
		float ex;
		ex = var1 * var2;
		float suel = (float) (1034 + ex - 0.15);
		System.out.println("El sueldo que gana mensual mente es: " + suel);
	}

}
