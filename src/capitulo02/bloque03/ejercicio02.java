package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class ejercicio02 {

	public static void main(String[] args) {
		int opcion = -1;
		while(opcion != 0) {
			System.out.println("1-Realizar una raiz");
			System.out.println("2-Realizar una potenciaencia");
			System.out.println("3-Realizar el modulo de la división");
			System.out.println("0-Salir");
			String str = JOptionPane.showInputDialog("Elija una opción: ");
			opcion = Integer.parseInt(str);
			switch (opcion) {
			case 0:
				break;
			case 1:
				String str1 = JOptionPane.showInputDialog("Introduce indice de la raiz: ");
				double variable1 = Double.parseDouble(str1);
				String str2 = JOptionPane.showInputDialog("Introduce el radicalcal de la raiz: ");
				int radical = Integer.parseInt(str2);
				double indice = 1 / variable1;
				double raiz = Math.pow(radical, indice);
				System.out.println("La raiz de indice " + variable1 + " y de radicalcal " + radical + " tiene como solución: " + raiz);
				break;
			case 2:
				String str3 = JOptionPane.showInputDialog("Introduce indice de la potenciaencia: ");
				int indice1 = Integer.parseInt(str3);
				String str4 = JOptionPane.showInputDialog("Introduce el radicalcal de la potenciaencia: ");
				int radical1 = Integer.parseInt(str4);
				double potencia = Math.pow(indice1 , radical1);
				System.out.println("La raiz de indice " + indice1 + " y de radicalcal " + radical1 + " tiene como solución: " + potencia);
				break;
			case 3:
				String str5 = JOptionPane.showInputDialog("Introduce la primera variable: ");
				int indice3 = Integer.parseInt(str5);
				String str6 = JOptionPane.showInputDialog("Introduce la segunda variable: ");
				int radical3 = Integer.parseInt(str6);
				double modulodivision = indice3 % radical3;
				System.out.println("La raiz de indice " + indice3 + " y de radicalcal " + radical3 + " tiene como solución: " + modulodivision);
				break;
			default:
				System.out.println("Opcón no válida");
			
			}
		}
	}

}
