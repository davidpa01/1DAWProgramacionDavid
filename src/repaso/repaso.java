package repaso;

import javax.swing.JOptionPane;

public class repaso {
	public static void main(String[] args) {
	String r = JOptionPane.showInputDialog("Introduze el valor del radio del circulo");
	float var1 = Float.parseFloat(r);
	float a = (float) (Math.PI * Math.pow(var1,2));
	System.out.println("El area del circulo es: " + a);


}
}	
