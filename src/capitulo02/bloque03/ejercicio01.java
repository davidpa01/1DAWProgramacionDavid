package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejercicio01 {

	public static void main(String[] args) {
		String var1 = JOptionPane.showInputDialog("Introduce tu nota: ");
		int nota = Integer.parseInt(var1);
		switch (nota) {
		case 0:
		case 1:
		case 2:
			System.out.println("La nota que ha introducido es un Muy deficiente");
			break;
		case 3:
		case 4:
			System.out.println("La nota que ha introducido es un Deficiente");
			break;
		case 5:
			System.out.println("La nota que ha introducido es un Suficiente");
			break;
		case 6:
			System.out.println("La nota que ha introducido es un Bien");
			break;
		case 7:
		case 8:
			System.out.println("La nota que ha introducido es un Notable");
			break;
		case 9:
		case 10:
			System.out.println("La nota que ha introducido es un Sobresaliente");
			break;
		default:
			System.out.println("La nota introducida no es valida");
		}

	}

}
