package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {
		int num;
		do {//Se realiza lo que esta dentro y luego se mira la condicion del bucle
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (0 para terminar)"));//se pide un numero
			if (num > 0) {//si numero es mayor de cero, muestra que el numero es positivo
				System.out.println("El número " + num + " es positivo");
			}
			else {
				if (num < 0 && num != 0) {//si el numero es menor de cero y es distinto de cero muestra el numero como negativo
					System.out.println("El número " + num + " es negativo");					
				}
			}
		} while (num != 0);//se repite el bucle infinito mientra que num se a distinto de cero
	}
}
