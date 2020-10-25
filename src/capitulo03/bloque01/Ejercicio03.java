package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int num = 1;
		for (;num != 0;) {// se crea un bucle que se repite mientras el numero sea distinto de 0
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número(0 para terminar): "));// se pide un numero
			if (num > 0) {// si el numero es mayor de cero muestra la linea de abajo
				System.out.println("El número " + num + " es positivo");
			} 
			else {
				if (num < 0 && num != 0) {//si el numero es menor de cero muestra la linea de abajo 
					System.out.println("El número " + num + " es negativo");
				}
			}
		}
	}
}
