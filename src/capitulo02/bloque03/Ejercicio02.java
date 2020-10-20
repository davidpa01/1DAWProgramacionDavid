package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		int opcion = -1;
		while(opcion != 0) {//Creo un menu con un while que se repite hasta que opcion = 0
			System.out.println("1-Realizar una raiz");
			System.out.println("2-Realizar una potenciaencia");
			System.out.println("3-Realizar el modulo de la división");
			System.out.println("0-Salir");
			String str = JOptionPane.showInputDialog("Elija una opción: ");//Guardo datos en una variable
			opcion = Integer.parseInt(str);//Transformo los datos en numeros enteros
			switch (opcion) {//se comprueba la opción
			case 0://0 para salir
				break;
			case 1://si la opcion en 1 calcula la raiz 
				String str1 = JOptionPane.showInputDialog("Introduce indice de la raiz: ");
				double variable1 = Double.parseDouble(str1);
				String str2 = JOptionPane.showInputDialog("Introduce el radicalcal de la raiz: ");
				int radical = Integer.parseInt(str2);
				double indice = 1 / variable1;
				double raiz = Math.pow(radical, indice);
				System.out.println("La raiz de indice " + variable1 + " y de radicalcal " + radical + " tiene como solución: " + raiz);
				break;
			case 2:// si la opcion es 2 calcula un numero elevado a otro
				String str3 = JOptionPane.showInputDialog("Introduce indice de la potenciaencia: ");
				int indice1 = Integer.parseInt(str3);
				String str4 = JOptionPane.showInputDialog("Introduce el radicalcal de la potenciaencia: ");
				int radical1 = Integer.parseInt(str4);
				double potencia = Math.pow(indice1 , radical1);
				System.out.println("La raiz de indice " + indice1 + " y de radicalcal " + radical1 + " tiene como solución: " + potencia);
				break;
			case 3:// si la opcion es 3 calcula el modulo de la division
				String str5 = JOptionPane.showInputDialog("Introduce la primera variable: ");
				int indice3 = Integer.parseInt(str5);
				String str6 = JOptionPane.showInputDialog("Introduce la segunda variable: ");
				int radical3 = Integer.parseInt(str6);
				double modulodivision = indice3 % radical3;
				System.out.println("La raiz de indice " + indice3 + " y de radicalcal " + radical3 + " tiene como solución: " + modulodivision);
				break;
			default:// si la opcion no es ni una de las anteriores muestra lo siguiente en pantalla
				System.out.println("Opcón no válida");
			
			}
		}
	}

}
