package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejerecicio3 {

	public static void main(String[] args) {
		int opcion = -1;
		while(opcion != 0) {
			System.out.println("1-Realizar una raiz");
			System.out.println("2-Realizar una potenciaencia");
			System.out.println("3-Realizar el modulo de la división");
			System.out.println("0-Salir");
			String str = JOptionPane.showInputDialog("Elija una opción: ");
			opcion = Integer.parseInt(str);
		}

	}

}
